package networkprogramming.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP文件下载客户端
 */
public class TCPFileDownloadClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名：");
        String downloadFileName = scanner.next();
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        // 设置写入结束标志
        socket.shutdownOutput();
        // 接受服务器返回的文件字节数组
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 将文件写入磁盘
        String filePath = "D:\\" + downloadFileName + ".jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        bos.close();
        socket.close();
        outputStream.close();
        bis.close();
    }
}
