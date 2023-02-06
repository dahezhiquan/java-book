package seniorobject.interface_;

/**
 * 实现手机📱接口
 */
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("📱开始连接...");
    }

    @Override
    public void stop() {
        System.out.println("📱中断连接...");
    }
}
