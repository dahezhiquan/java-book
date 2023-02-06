package seniorobject.interface_;

/**
 * 接口
 */
public interface UsbInterface {
    public int n = 521;
    default public void show() {
        System.out.println("我是接口的方法");
    }
    public static void hi() {
        System.out.println("你好啊");
    }
    // 规定接口的相关方法，接口规范
    // 接口中定义抽象方法可以省略abstract关键字
    public void start();
    public void stop();
}
