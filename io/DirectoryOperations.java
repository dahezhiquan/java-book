package io;

import java.io.File;

/**
 * javaIO目录操作
 */
public class DirectoryOperations {
    public static void main(String[] args) {
        // 判断指定路径文件是否存在，如果存在就删除
        String filePath = "D:\\news.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } else {
            System.out.println("文件不存在！");
        }

        // 判断目录是否存在，如果存在即删除
        String dirPath = "D:\\demo";
        File file1 = new File(dirPath);
        if (file1.exists()) {
            if (file1.delete()) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } else {
            System.out.println("目录不存在！");
        }

        // 判断指定目录是否存在，不存在就创建目录
        String persondir = "D:\\demo\\a\\b\\c";
        File file2 = new File(persondir);
        if (file2.exists()) {
            System.out.println("该目录存在！");
        } else {
            if (file2.mkdirs()) {
                System.out.println("目录创建成功！");
            } else {
                System.out.println("目录创建失败！");
            }
        }
    }
}
