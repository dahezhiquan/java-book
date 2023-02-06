package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 包装流
 * BufferedReader常用于读取文本文件
 * 包装流是节点流的升级版本
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hacker.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        // 按行读取，效率高
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        // 关闭流
        bufferedReader.close();
    }
}
