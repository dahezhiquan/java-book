package multithreading;

import java.awt.*;

/**
 * 线程锁
 */
public class ThreadLock {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock(true);
        DeadLock deadLock1 = new DeadLock(false);
        deadLock.start();
        deadLock1.start();
    }
}

/**
 * 锁🔒机制
 */
class LockTest implements Runnable {
    // 同步静态方法的锁🔒，是加在当前类本身ThreadLock.class
    public synchronized static void mm(){

    }

    // 静态方法内部代码块加锁🔒
    public static void yy() {
        synchronized (ThreadLock.class) {
            System.out.println("猪猪！");
        }
    }

    @Override
    public void run() {

    }
}

/**
 * 线程死锁
 */
class DeadLock extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}