package io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 */
public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hacker.txt";
        // 创建对象
        FileWriter fileWriter = null;
        try {
            char[] chars = {'a', 'b', 'c'};
            fileWriter = new FileWriter(filePath, true);
            // 写入单个字符
            // fileWriter.write('H');
            // 写入字符数组
            // fileWriter.write(chars);
            // 指定数组的范围写入
            // fileWriter.write(chars, 0, 2);
            // 写入字符串
            // fileWriter.write("解放军万岁！");
            // 指定字符串的写入范围
            fileWriter.write("hacker club", 0, 5);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // FileWriter是需要强制关闭文件或刷新流的，否则数据会保存失败
            fileWriter.close();
        }
    }
}
