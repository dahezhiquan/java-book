package io;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流
 * 从文件中读取数据
 */
public class FileInputStreamText {
    public static void main(String[] args) {

    }

    /**
     * read()读文件
     * 单个字节的读取，效率较低
     */
    @Test
    public void readFile01() throws IOException {
        String filePath = "D:\\hacker.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            // 读文件，一个字符一个字符读取，返回字符的ASCII码，文件尾部返回-1
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭流资源
            fileInputStream.close();
        }
    }


    /**
     * read(byte[] b)读文件
     * 支持多字节读取，提升效率
     */
    @Test
    public void readFile02() throws IOException {
        String filePath = "D:\\hacker.txt";
        int readData = 0;
        int readLen = 0;
        // 字节数组
        byte[] bytes = new byte[8]; // 一次最多读取8个字节

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            // 读文件，从字节数组中直接读取
            // 如果读取正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭流资源
            fileInputStream.close();
        }
    }
}
