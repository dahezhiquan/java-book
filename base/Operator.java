package base;

/**
 * 运算符
 */
public class Operator {
    public static void main(String[] args) {
        // 基本运算符
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );

        // 自增自减运算符
        int c = a++;
        int d = ++b;
        System.out.println(c);
        System.out.println(d);
        // 面试题
        int i = 1;
        i = i++;
        System.out.println(i); // 1
        int j = 1;
        j = ++j;
        System.out.println(j); // 2

        // 关系运算符
        int e = 10;
        int f = 20;
        System.out.println("e == f = " + (e == f) );
        System.out.println("e != f = " + (e != f) );
        System.out.println("e > f = " + (e > f) );
        System.out.println("e < f = " + (e < f) );
        System.out.println("f >= e = " + (f >= e) );
        System.out.println("f <= e = " + (f <= e) );

        // 普通逻辑运算符
        boolean g = true;
        boolean h = false;
        System.out.println("g && h = " + (g&&h));
        System.out.println("g || h = " + (g||h) );
        System.out.println("!(g && h) = " + !(g && h));

        // 赋值运算符
        int k = 1;
        int l = 2;
        k += l;
        System.out.println(k);
        // 复合赋值运算符底层会进行一个强制的类型转换
        byte m = 1;
        m += 2;
        System.out.println(m);

        // 三元运算符
        int n , o;
        n = 10;
        // 如果 n 等于 1 成立，则设置 o 为 20，否则为 30
        o = (n == 1) ? 20 : 30;
        System.out.println( "Value of o is : " +  o );

        // 扬帆启航😀
    }
}
