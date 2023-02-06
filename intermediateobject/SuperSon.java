package intermediateobject;

/**
 * super关键字演示子类
 */
public class SuperSon extends SuperFather {
    public void test() {
        // 访问父类的属性，不能访问父类的私有属性
        System.out.println(super.n1 + super.n2 + super.n3);
        // 访问父类的方法，同样不能访问父类的私有方法
        super.say();
        super.show();
        // 本类中没有sum方法，则去父类中找sum方法，父类没有则找爷爷类
        sum();
        // 子类和父类重名的方法
        super.cal();
    }

    public void cal() {
        System.out.println("我是子类的cal功能！");
    }

    public SuperSon() {
        // 访问父类的构造器
        // 访问无参构造
        super();
    }
}
