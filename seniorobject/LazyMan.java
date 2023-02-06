package seniorobject;

/**
 * 设计模式 - 懒汉式
 */
public class LazyMan {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);
        Cat cat2 = Cat.getInstance();
        System.out.println(cat2);
    }
}

class Cat {
    private String name;
    // 定义一个static属性对象
    private static Cat cat;

    // 提供一个公共的public的static方法，可以创建并返回一个Cat对象
    public static Cat getInstance() {
        if (cat == null) {
            System.out.println("创建了一只猫");
            cat = new Cat("喵喵~");
        }
        return cat;
    }

    // 构造器私有化
    private Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}