package object;

/**
 * this关键字
 */
public class This {
    String name;
    int age;


    public This() {
        this("wangwei",22);
        System.out.println("无参构造");
    }

    public This(String name, int age) {
        // this.name，this.age表示当前对象的属性
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }


    public void f1() {
        System.out.println("f1");
    }

    public void f2() {
        System.out.println("f2");
        // 使用this调用本类的方法
        this.f1();
    }
}
