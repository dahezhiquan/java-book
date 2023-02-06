package seniorobject.innerclass;

/**
 * 静态内部类
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer004 outer004 = new Outer004();
        // 通过类名直接访问
        Outer004.Inner004 inner004 = new Outer004.Inner004();
        inner004.say();
        // 静态内部类的外部类创建一个返回内部类对象的公有方法
        Outer004.Inner004 inner0041 = outer004.getInner004();
        inner0041.say();
        // 静态内部类的外部类创建一个返回内部类对象的公有静态方法
        Outer004.Inner004 inner0042 = Outer004.getInner004_();
        inner0042.say();
    }
}

class Outer004 {
    private int n = 521;
    private static String name = "dahe";
    public static class Inner004 {
        public void say() {
            // 可以直接访问外部类的静态成员
            System.out.println(name);
        }
    }

    // 返回静态内部类的对象实例
    public Inner004 getInner004() {
        return new Inner004();
    }

    // 返回静态内部类的对象实例，但是是静态方法
    public static Inner004 getInner004_() {
        return new Inner004();
    }
}
