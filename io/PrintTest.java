package io;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流
 */
public class PrintTest {
    public static void main(String[] args) {

    }
    /**
     * 字节打印流
     */
    @Test
    public void PrintStreamTest() throws IOException {
        PrintStream out = System.out;
        // 默认情况下，PrintStream输出的位置是标准输出，即显示器
        out.println("hello!");
        out.write("你好哦".getBytes());
        // 可以修改打印流输出的位置
        // 比如修改打印位置为文件中
        System.setOut(new PrintStream("D:\\hacker.txt"));
        System.out.println("华仔华仔！");
        out.close();
    }

    /**
     * 字符打印流
     */
    @Test
    public void PrintWriterTest() throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("你好");
        // 可以修改打印流输出的位置
        // 比如修改打印位置为文件中
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\hacker.txt"));
        pw.print("我在文件里");
        printWriter.close();
        pw.close();
    }
}
