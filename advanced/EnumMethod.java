package advanced;
/**
 * 枚举类方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        // 获取当前枚举对象的名称
        System.out.println(autumn.name());

        // 输出该枚举对象的次序，从0开始
        System.out.println(autumn.ordinal());

        // 返回所有的枚举对象
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        // 将字符串转化为枚举对象,要求字符串必须为已有的常量名，否则会爆出一个异常
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);

        // 比较两个枚举常量，比较的就是编号
        // AUTUMN的编号减去SUMMER的编号
        System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));
    }
}
