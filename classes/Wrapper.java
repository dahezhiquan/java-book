package classes;

/**
 * 包装类
 */
public class Wrapper {
    public static void main(String[] args) {
        // 装箱和拆箱，JDK5之后，自动进行装箱拆箱
        int n = 521;
        // 自动装箱
        // 底层使用的依然是Integer.valueOf的新建对象的方式
        Integer integer = n;
        System.out.println(integer);
        // 自动拆箱
        // 底层依然是使用的intValue方法
        int m = integer;
        System.out.println(m);

        // 包装类 --> String
        Integer i = 1314;
        // 方式1
        String s = i + "";
        System.out.println(s);
        // 方式2
        String s2 = i.toString();
        System.out.println(s2);
        // 方式3
        String s3 = String.valueOf(i);
        System.out.println(s3);

        // String --> 包装类
        String ss = "5211314";
        Integer j = Integer.parseInt(ss);
        System.out.println(j);

        // 一些常用方法
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.isDigit('a')); // 判断是否为数字
        System.out.println(Character.isLetter('a')); // 判断是否为字母
        System.out.println(Character.isUpperCase('a')); // 判断是否为大写
        System.out.println(Character.isLowerCase('a')); // 判断是否为小写
    }
}
