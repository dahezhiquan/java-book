package seniorobject.innerclass;

/**
 * 成员内部类
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer003 outer003 = new Outer003();
        outer003.t();

        // 外部其他类使用成员内部类的两种方式
        Outer003.Inner003 inner003 = outer003.new Inner003();
        inner003.say();
        // 成员内部类的外部类创建一个返回内部类对象的公有方法
        Outer003.Inner003 inner0031 = outer003.getInner003Instance();
        inner0031.say();
    }
}

class Outer003 {
    private int n = 521;
    public String name = "dahe";

    class Inner003 { // 成员内部类
        public void say() {
            // 直接访问外部类的所有成员
            System.out.println(n + name);
        }
    }

    // 提供一个
    public Inner003 getInner003Instance() {
        return new Inner003();
    }

    public void t() {
        // 使用成员内部类
        Inner003 inner003 = new Inner003();
        inner003.say();
    }
}

