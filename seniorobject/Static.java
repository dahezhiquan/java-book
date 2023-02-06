package seniorobject;

/**
 * 类变量和类方法
 */
public class Static {
    public static void main(String[] args) {
        Child dahe = new Child("dahe");
        dahe.join();
        dahe.count++;
        Child zhangsan = new Child("张三");
        zhangsan.join();
        zhangsan.count++;
        Child lisi = new Child("李四");
        lisi.join();
        lisi.count++;
        System.out.println(Child.count);

        // 调用类方法
        Child.show();
    }
}

class Child {
    private String name;
    // 该变量最大的特点就是会被Child类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏..");
    }

    // 静态方法
    public static void show() {
        System.out.println("我是一个静态方法");
        System.out.println(count);
    }
}
