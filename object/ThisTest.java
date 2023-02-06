package object;

/**
 * this关键字测试类
 */
public class ThisTest {
    public static void main(String[] args) {
        This t = new This("dahe", 18);
        System.out.println(t.hashCode());
        t.f2();
    }
}
