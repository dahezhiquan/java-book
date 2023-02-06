package seniorobject;

/**
 * 饿汉式设计模式
 */
public class HungryMan {
    public static void main(String[] args) {
        // 饿汉式只能存在一个对象实例！
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf);
    }
}

class GirlFriend {
    private String name;

    // 在类的内部创建一个对象
    private static GirlFriend gf = new GirlFriend("Miss.qian");

    // 提供一个公共的static方法，返回gf对象
    public static GirlFriend getInstance() {
        return gf;
    }

    // 构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}