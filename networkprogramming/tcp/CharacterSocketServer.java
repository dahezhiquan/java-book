package networkprogramming.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基于字符流的TCP编程
 * 服务端
 */

public class CharacterSocketServer {
    public static void main(String[] args) throws IOException {
        // 在本地的9999端口进行监听
        // 细节：需要确保9999端口处于空闲状态
        ServerSocket serverSocket = new ServerSocket(9999);
        // 没有客户端链接时，会阻塞，等待链接
        // 有客户端链接，则会返回一个Socket对象
        Socket socket = serverSocket.accept();
        // 通过输入流获取客户端发来的数据
        InputStream inputStream = socket.getInputStream();
        // IO转换流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        // 必须使用readLine方式来读
        String s = br.readLine();
        System.out.println(s);
        // 向客户端回送消息
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("Hello,Client 字符流");
        bw.newLine();
        bw.flush();
        // 关闭资源
        br.close();
        bw.close();
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
