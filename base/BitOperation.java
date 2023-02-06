package base;

/**
 * 二进制和位运算
 */
public class BitOperation {
    public static void main(String[] args) {
        // 进制
        int n1 = 0b1010; // 二进制
        int n2 = 1010; // 十进制
        int n3 = 01010; // 八进制
        int n4 = 0x1010; // 十六进制
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        // 位运算
        int a = 2; // 补码：10
        int b = 3; // 补码：11
        System.out.println(a&b); // 2
        System.out.println(a|b); // 3
        System.out.println(a^b); // 1
        System.out.println(~a); // -3
        // 移位运算
        System.out.println(1>>2); // 一位相当于 / 2
        System.out.println(1<<2); // 一位相当于 * 2
        System.out.println(1>>>2); // 无符号右移
    }
}
