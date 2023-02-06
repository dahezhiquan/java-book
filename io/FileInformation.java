package io;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * 获取文件信息
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    /**
     * 获取文件信息
     */
    @Test
    public void info() {
        // 创建文件对象
        File file = new File("D:\\news.txt");
        // 获取文件名字
        System.out.println(file.getName());
        // 获取文件路径
        System.out.println(file.getAbsolutePath());
        // 获取文件父亲目录
        System.out.println(file.getParent());
        // 获取文件大小（字节）
        System.out.println(file.length());
        // 文件是否存在
        System.out.println(file.exists());
        // 是不是一个文件
        System.out.println(file.isFile());
        // 是不是一个目录
        System.out.println(file.isDirectory());
    }
}
