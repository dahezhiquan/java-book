package networkprogramming.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        // 链接服务端，由于是测试程序，直接获取本机的地址即可
        // 链接本机的9999端口，链接成功会返回一个Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 创建流向服务器端发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello Server".getBytes());
        // 设置结束标记
        socket.shutdownOutput();
        // 获取服务端的回送数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        // 关闭输出流对象和socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出！");
    }
}
