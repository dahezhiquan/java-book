package io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties读取修改示例
 */
public class PropertiesTest {
    public static void main(String[] args) {

    }

    /**
     * 读取
     */
    @Test
    public void read() throws IOException {
        Properties properties = new Properties();
        // 加载配置文件
        properties.load(new FileReader("io\\mysql.properties"));
        // 把 k-v 显示在控制台
        properties.list(System.out);
        // 根据key获取值
        String password = properties.getProperty("password");
        System.out.println(password);
    }

    /**
     * 修改
     */
    @Test
    public void write() throws IOException {
        Properties properties = new Properties();
        // 设置键值对
        // 如果键已经存在，则等价于修改键
        properties.setProperty("user","汤姆");
        properties.setProperty("passwd","youwillwin");
        // 存储键值对
        properties.store(new FileOutputStream("io\\mysql.properties"),"mysql test data");
    }
}
