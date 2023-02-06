package seniorobject;

/**
 * 深入理解main函数
 */
public class Main {
    private static String name = "dahezhiquan";
    public static void hello() {
        System.out.println("hello main!");
    }
    int counter = 521;
    public static void main(String[] args) {
        // 打印运行时传入的参数
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // main方法可以直接访问本类的静态成员
        System.out.println(name);
        hello();

        // 访问非静态成员，需要类实例化
        Main main = new Main();
        System.out.println(main.counter);
    }
}
