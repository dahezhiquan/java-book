package multithreading;

/**
 * 守护线程
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        AAA aaa = new AAA();
        // 希望主线程结束后，子线程可以自动结束，将子线程设置为守护线程即可
        aaa.setDaemon(true);
        aaa.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(300);
            System.out.println("主线程");
        }
    }
}

class AAA extends Thread {
    @Override
     public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是AAA！我在吃包子" + i);
        }
    }
}