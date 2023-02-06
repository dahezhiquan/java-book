package object;

/**
 * 方法重载，可变参数的测试类
 */
public class OverloadTest {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int res1 = overload.calculate(1,2,3);
        double res2 = overload.calculate(5.21,1314);
        System.out.println(res1);
        System.out.println(res2);
        int sumRes = overload.sum(10,20,30,40,50,60);
        System.out.println(sumRes);
    }
}
