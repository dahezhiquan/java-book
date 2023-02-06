package classes.aggregate;

import java.util.Properties;

/**
 * Properties演示
 */
public class PropertiesText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Properties properties = new Properties();
        // 增加
        properties.put("john",521);
        properties.put("tom",1314);
        properties.put("tom",100);
        System.out.println(properties);
        // 通过key获取值
        System.out.println(properties.get("tom"));
        // 删除
        properties.remove("tom");
        System.out.println(properties);
    }
}
