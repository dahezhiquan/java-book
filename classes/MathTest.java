package classes;

/**
 * 数学类
 */
public class MathTest {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(-9));
        // 求幂
        System.out.println(Math.pow(2, 4));
        // 向上取整
        System.out.println(Math.ceil(5.21));
        // 向下取整
        System.out.println(Math.floor(5.21));
        // 四舍五入
        System.out.println(Math.round(5.21));
        // 求开方
        System.out.println(Math.sqrt(4));
        // 随机数
        // 返回0到1的一个小数
        System.out.println(Math.random());
        for (int i = 0; i < 100; i++) {
            // 生成某一个范围的随机数值，例如生成2到10的随机数
            System.out.println((int) (2 + Math.random() * 9));
        }
        // 返回最大值和最小值
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));
    }
}
