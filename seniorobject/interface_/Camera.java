package seniorobject.interface_;

/**
 * 实现相机📷接口
 */
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("📷开始连接...");
    }

    @Override
    public void stop() {
        System.out.println("📷中断连接...");
    }
}
