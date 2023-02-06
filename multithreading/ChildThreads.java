package multithreading;

/**
 * 多个子线程案例
 */
public class ChildThreads {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();
        thread1.start();
    }
}

class T1 implements Runnable {
    int times = 0;
    @Override
    public void run() {
        // 每隔1秒输出一次hello world
        while (true) {
            System.out.println("hello world" + (++times));
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

class T2 implements Runnable {

    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + (++times));
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