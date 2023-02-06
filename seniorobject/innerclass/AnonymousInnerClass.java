package seniorobject.innerclass;

/**
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer002 outer002 = new Outer002();
        outer002.method();
    }
}

class Outer002 {
    private int n = 521;

    public void method() {
        // 基于接口的匿名内部类
        // tiger的编译类型是IA，运行类型就是匿名内部类！
        // 系统分配该类名的时候会在外部类的基础上加上$1，此处是Outer002$1
        // JDK底层在创建了匿名内部类之后，立即创建了一个实例，并且把地址返回给tiger
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("我是一只小老虎🐅");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());

        // 基于类的匿名内部类，加入大括号就摇身一变变成内部类了
        Father jack = new Father("jack"){
            @Override
            public void test() {
                super.test();
                System.out.println("♪(^∇^*)");
            }
        };
        System.out.println(jack.getClass());
    }
}

interface IA {
    public void cry();
}

class Father {
    private String name;

    public Father(String name) {
        this.name = name;
        System.out.println(this.name);
    }
    public void test() {

    }
}