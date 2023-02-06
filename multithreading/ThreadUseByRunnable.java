package multithreading;

/**
 * 通过继承Runnable接口实现多线程
 */
public class ThreadUseByRunnable {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();
        // 通过创建Thread类传入dog从而执行线程
        Thread thread = new Thread(dog);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }
    }
}

/**
 * 通过实现Runnable接口实现多线程
 */
class Dog implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗旺旺🐕" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 8) {
                break;
            }
        }
    }
}