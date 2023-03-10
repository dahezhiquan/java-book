package multithreading;

import java.awt.*;

/**
 * çº¿ç¨é
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
 * éðæºå¶
 */
class LockTest implements Runnable {
    // åæ­¥éææ¹æ³çéðï¼æ¯å å¨å½åç±»æ¬èº«ThreadLock.class
    public synchronized static void mm(){

    }

    // éææ¹æ³åé¨ä»£ç åå éð
    public static void yy() {
        synchronized (ThreadLock.class) {
            System.out.println("çªçªï¼");
        }
    }

    @Override
    public void run() {

    }
}

/**
 * çº¿ç¨æ­»é
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
                System.out.println(Thread.currentThread().getName() + "è¿å¥1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "è¿å¥2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "è¿å¥3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "è¿å¥4");
                }
            }
        }
    }
}