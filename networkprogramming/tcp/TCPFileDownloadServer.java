package networkprogramming.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP文件下载服务端
 */
public class TCPFileDownloadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        // 读取客户端发送的要下载的文件名称
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        // 客户端要下载的文件名
        String downloadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downloadFileName += new String(b, 0, len);
        }

        // 提供给客户端下载的实际文件名
        String resFileName = "";
        if ("color".equals(downloadFileName)) {
            resFileName = "networkprogramming\\tcp\\color.jpg";
        } else {
            resFileName = "networkprogramming\\tcp\\fish.jpg";
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        // 使用工具类将文件保存到一个字节数组中
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        // 写入到数据通道，返回给客户端
        bos.write(bytes);
        socket.shutdownOutput();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
