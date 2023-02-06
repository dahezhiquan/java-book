package multithreading;

/**
 * 线程常用方法
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        TextThread textThread = new TextThread();
        // 设置线程名称
        textThread.setName("dahe");
        // 设置线程优先级
        textThread.setPriority(Thread.MIN_PRIORITY);
        // 启动子线程
        textThread.start();
        // 获取线程优先级
        System.out.println(textThread.getPriority());
        // 中断线程休眠
        // textThread.interrupt();
        DDD ddd = new DDD();
        ddd.start();
        for (int i = 0; i < 10; i++) {
            // 线程礼让，让出CPU，但礼让的时间不确定，所以也不一定礼让成功
            if (i == 2) {
                Thread.yield();
            }
            // 让子线程插队，ddd先执行完再继续执行子线程
            if (i == 5) {
                ddd.join();
            }
            Thread.sleep(1000);
            System.out.println("主线程吃包子" + i);
        }
    }
}

class TextThread extends Thread {
    @Override
    public void run() {
        // 线程休眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 获取当前线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}

class DDD extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是DDD！我在吃包子" + i);
        }
    }
}
