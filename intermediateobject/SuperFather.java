package intermediateobject;

/**
 * super关键字演示父类
 */
public class SuperFather {
    public int n1 = 100;
    int n2 = 110;
    protected int n3 = 120;
    private int n4 = 130;

    public void say() {
        System.out.println("我是公开的方法");
    }

    protected void show() {
        System.out.println("我是受保护的方法");
    }

    private void can() {
        System.out.println("我是私有方法");
    }

    public void sum() {
        System.out.println("我是sum功能！");
    }

    public void cal() {
        System.out.println("我是父类的cal功能 ！");
    }
}
