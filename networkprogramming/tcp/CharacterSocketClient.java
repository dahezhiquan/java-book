package networkprogramming.tcp;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 基于字符流的TCP编程
 * 客户端
 */

public class CharacterSocketClient {
    public static void main(String[] args) throws IOException {
        // 链接服务端，由于是测试程序，直接获取本机的地址即可
        // 链接本机的9999端口，链接成功会返回一个Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        // 创建流向服务器端发送数据
        OutputStream outputStream = socket.getOutputStream();
        // 使用IO转换流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,server 字符流");
        // 插入换行符，表示写入的内容结束
        bw.newLine();
        // 使用字符流，必须手动刷新，否则数据将不会写入通道
        bw.flush();
        // 设置结束标记
        socket.shutdownOutput();
        // 获取服务端的回送数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);
        // 关闭输出流对象和socket
        br.close();
        bw.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出！");
    }
}
