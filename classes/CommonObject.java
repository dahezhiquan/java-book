package classes;

/**
 * 常用Object类
 */
public class CommonObject {
    public static void main(String[] args) {
        // equals类
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        // hashCode
        A a = new A();
        A a1 = new A();
        A a2 = a;
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        // toString
        A a3 = new A("dahe",25,"安全服务工程师");
        System.out.println(a3.toString());
        System.out.println(a3);

        // finalize
        A a4 = new A("dh",33,"架构师");
        a4 = null; // 这是a4成为了垃圾，垃圾回收器就会回收对象
        // 在销毁对象之前，会调用对象的finalize方法
        // 程序员就可以在这个方法中写入自己的业务，释放资源
        System.gc(); // 主动调用垃圾回收器
    }
}

class A {
    private String name;
    private int age;
    private String job;

    public A() {}

    public A(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    // 不推荐写法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁对象");
    }
}
