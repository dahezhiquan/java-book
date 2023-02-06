package io;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 转换流
 * 字节流 --> 字符流
 */
public class TransformStream {
    public static void main(String[] args) {

    }

    /**
     * InputStreamReader演示
     */
    @Test
    public void InputStreamReaderTest() throws IOException {
        String filePath = "D:\\hacker.txt";
        // FileInputStream转换为InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
        // 把InputStreamReader传入BufferedReader
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }

    /**
     * OutputStreamWriter
     */
    @Test
    public void OutputStreamWriterTest() throws IOException {
        String filePath = "D:\\hacker.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");
        osw.write("hi,kiki!");
        osw.write("我是大河！");
        osw.close();
    }
}
