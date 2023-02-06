package networkprogramming.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 文件上传，客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        // 创建读取磁盘文件的输入流
        String filePath = "D:\\color.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        // 此时的bytes就是文件的字节内容
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        // 通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        // 写入数据结束标记
        socket.shutdownOutput();

        // 关闭资源
        bos.close();
        socket.close();
    }
}
