package advanced;

/**
 * java枚举
 */
public class Enum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
        System.out.println(Season.Other);
    }
}

// 定义的枚举类
enum Season {
    // 枚举定义的常量对象必须在最前面
    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "寒冷刺骨"),
    Other, Shit;

    private String name;
    private String desc;

    Season() {
    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
