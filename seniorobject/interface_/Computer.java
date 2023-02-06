package seniorobject.interface_;

/**
 * 开始工作
 */
public class Computer {
    public void work(UsbInterface usbInterface) {
        // 通过接口调用方法
        // 这里可以体现多态思想
        usbInterface.start();
        usbInterface.stop();
    }
}
