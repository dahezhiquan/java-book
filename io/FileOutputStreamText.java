package io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 * 数据 --> 文件
 */
public class FileOutputStreamText {
    public static void main(String[] args) {

    }

    /**
     * FileOutputStream数据写入文件
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() throws IOException {
        String filePath = "D:\\hacker.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            // 写入一个字节
            // fileOutputStream.write('G');
            // 写入一个字符串
            String s = "hello hacker!";
            // fileOutputStream.write(s.getBytes());
            // 写入字符串指定范围的字符
            fileOutputStream.write(s.getBytes(),0,3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileOutputStream != null;
            fileOutputStream.close();
        }
    }
}
