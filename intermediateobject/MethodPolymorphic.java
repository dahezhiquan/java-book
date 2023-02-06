package intermediateobject;

/**
 * 方法多态演示
 */
public class MethodPolymorphic {
    public static void main(String[] args) {
        A a = new A();
        // 这里我们传入不同的参数，就会调用不同的sum方法，实现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));
        B b = new B();
        // 虽然调用的都是say方法，但是结果不同，实现多态
        a.say();
        b.say();

    }
}

class B {
    public void say() {
        System.out.println("B类的say方法被调用");
    }
}

class A extends B {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A类的say方法被调用");
    }
}