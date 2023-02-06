package multithreading;

/**
 * 多线程的基本使用
 * 通过继承Thread类创建线程
 */
public class ThreadUse {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start(); // 启动线程
        // 当程序自动一个子线程 Thread-0 ，主线程不会阻塞，会继续执行
        System.out.println("我还可以被输出！");
        Thread.sleep(2000);
        System.out.println("我是修狗🐕");
    }
}

/**
 * 继承Thread
 * 该类就可以当作线程使用
 */
class Cat extends Thread {
    // 重写run方法，写自己的业务
    // run方法实现了Runnable接口的run方法
    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("我是修猫🐱" + (++times));
            if (times == 1){
                System.out.println(Thread.currentThread().getName());
            }
            // 让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 8) {
                break;
            }
        }
    }
}
