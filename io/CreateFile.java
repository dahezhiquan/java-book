package io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件
 */
public class CreateFile {
    public static void main(String[] args) {

    }

    /**
     * 创建文件，第一种方式
     */
    @Test
    public void createFile01() {
        String filePath = "D:\\1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建文件，第二种方式
     */
    @Test
    public void createFile02() {
        File parentFile = new File("D:\\");
        String fileName = "news.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 创建文件，第三种方式
     */
    @Test
    public void createFile03() {
        String parentPath = "D:\\";
        String fileName = "my.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
