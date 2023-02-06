package networkprogramming.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        // 在本地的9999端口进行监听
        // 细节：需要确保9999端口处于空闲状态
        ServerSocket serverSocket = new ServerSocket(9999);
        // 没有客户端链接时，会阻塞，等待链接
        // 有客户端链接，则会返回一个Socket对象
        Socket socket = serverSocket.accept();
        // 通过输入流获取客户端发来的数据
        InputStream inputStream = socket.getInputStream();
        // 读取内容
        byte[] buf = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLine));
        }
        // 向客户端回送消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        // 设置结束标记
        socket.shutdownOutput();
        // 关闭资源
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
