package io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {

    }

    /**
     * 文件拷贝
     * 思路：
     * 创建文件的输入流，将文件读取到程序
     * 创建文件的输出流，将读取到的文件数据写入到指定的文件
     */
    @Test
    public void Copy() throws IOException {
        String srcFilePath = "D:\\hacker.txt";
        String destFilePath = "D:\\hello.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            // 定义字节数组，提高效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                // 边读边写
                fileOutputStream.write(buf, 0, readLen);
            }
            System.out.println("拷贝成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
}
