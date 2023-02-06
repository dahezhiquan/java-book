package io;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流
 */
public class FileReaderTest {

    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hacker.txt";
        FileReader fileReader = null;
        // 循环读取内容
        int readLen = 0;
        char[] buf = new char[32];
        fileReader = new FileReader(filePath);
        while ((readLen = fileReader.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        fileReader.close();
    }
}
