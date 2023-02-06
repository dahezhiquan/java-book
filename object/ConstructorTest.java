package object;

/**
 * 构造方法的测试类
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // 构造器初始化
        Constructor c = new Constructor("IMUSTCTF",22);
        System.out.println(c.name + c.age);
        Constructor c1 = new Constructor("dahe");
        System.out.println(c1.name);
    }
}
