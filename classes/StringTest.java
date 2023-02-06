package classes;

/**
 * String练习
 */
public class StringTest {
    public static void main(String[] args) {
        // 直接赋值
        String name = "dahe";
        System.out.println(name);
        // 调用构造器赋值
        String wodeshijie = new String("wodeshijie");
        System.out.println(wodeshijie);

        // String类的常用方法
        String a = "imustctf";
        String b = "Imustctf";
        // 判断两字符串的值是否相等（区分大小写）
        System.out.println(a.equals(b));
        // 判断两字符串的值是否相等不区分大小写）
        System.out.println(a.equalsIgnoreCase(b));
        // 获取字符个数
        System.out.println(a.length());
        // 获取子字符串在字符串对象中第一次出现的索引位置，找不到返回-1
        int index = a.indexOf('m');
        System.out.println(index);
        // 获取子字符串在字符串对象中最后一次出现的索引位置，找不到返回-1
        int lastIndex = a.lastIndexOf('t');
        System.out.println(lastIndex);
        // 字符串截取
        System.out.println(a.substring(2)); // 截取2后面的所有字符
        System.out.println(a.substring(2, 5)); // 截取0 - 4的所有字符
        // 字符串转大写
        System.out.println(a.toUpperCase());
        // 字符串转小写
        System.out.println(b.toLowerCase());
        // 字符串拼接
        String c = "begin";
        c = c.concat(a).concat(b);
        System.out.println(c);
        // 替换
        c = c.replace("begin", "end");
        System.out.println(c);
        // 分割字符串
        String 春日山中对雪 = "竹树无声或有声，霏霏漠漠散还凝，" +
                "岭梅谢后重妆蕊，岩水铺来却结冰，" +
                "牢系鹿儿防猎客，满添茶鼎候吟僧，" +
                "好将膏雨同功力，松径莓苔又一层";
        String[] splitRes = 春日山中对雪.split("，");
        for (String splitRe : splitRes) {
            System.out.println(splitRe);
        }
        // 字符串转化为字符数组
        char[] chs = a.toCharArray();
        for (char ch : chs) {
            System.out.println(ch);
        }
        // 字符串比较，前者大返回正数，后者大返回负数，相等返回0
        System.out.println("abcd".compareTo("abcz"));
        // 字符串格式化
        String info = String.format("网站名字%s，首字母大写后%s", a, b);
        System.out.println(info);
    }
}


