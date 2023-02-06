package base;

/**
 * java数据类型
 */
public class Var {
    public static void main(String[] args) {
        // 整数类型
        byte a = 52;
        short b = 1314;
        int c = 5211314;
        long d = 5211314521L; // 数值用L标识
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 浮点数类型
        float e = 5.21f; // 数值用f或F标识
        double f = 5.211314;
        double g = 5.21E-2; // 科学计数法表示小数
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // 浮点数陷阱
        // 运算结果为浮点数时，不要轻易使用比较运算符，要小心精度丢失问题
        // 一个合理的解决方法是以两个数的差值的绝对值，在某个精度范围内判断
        // 错误的示范
        double h = 8.1/3;
        System.out.println(h);
        if (h == 2.7) {
            System.out.println("结果正确！");
        } else {
            System.out.println("结果错误！");
        }
        // 正确的示范
        if (Math.abs(h - 2.7) < 0.000001){
            System.out.println("结果正确！");
        } else {
            System.out.println("结果错误！");
        }

        // 字符类型
        char i = 'a';
        char j = 97; // 以ASCII码保存
        System.out.println(i);
        System.out.println(j);

        // 布尔类型
        boolean k = true;
        System.out.println(k);

        // 自动类型转换,低 -- 高
        int num = 'a';
        double l = 80;
        System.out.println(num);
        System.out.println(l);

        // 强制数据类型转换
        int m = (int)5.21;
        System.out.println(m);

        // 基本数据类型和字符串之间的转换
        // 基本数据类型 -- 字符串
        int n = 521;
        String s1 = n + ""; // 加双引号即可转换
        System.out.println(s1);
        // 字符串 -- 基本数据类型
        String s2 = "521";
        int o = Integer.parseInt(s2);
        System.out.println(o);
        // 得到s2字符串的第一个字符
        System.out.println(s2.charAt(0));
    }
}
