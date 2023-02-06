package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter演示
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\hacker.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("大河");
        bufferedWriter.newLine();
        bufferedWriter.write("之犬");
        bufferedWriter.close();
    }
}
