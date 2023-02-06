package seniorobject.innerclass;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer001 outer001 = new Outer001();
        outer001.show();
    }
}

class Outer001 { // 外部类
    private int n = 521;
    private int m = 100;
    private void kaka() {
        System.out.println("我是外部类的方法！");
    }

    public void show() {
        // 局部内部类定义在外部类的局部位置，通常在方法中
        final class Inner001 {
            // 局部内部类
            private int m = 1314;
            public void f() {
                // 可以直接访问外部类的所有成员，包含私有的
                System.out.println(n);
                // 内部类和外部类属性重名
                // 访问内部类的m
                System.out.println(m);
                // 访问外部类的m
                System.out.println(Outer001.this.m);
                kaka();
            }
        }
        // 外部类使用内部类的方法
        Inner001 inner001 = new Inner001();
        inner001.f();
    }
}
