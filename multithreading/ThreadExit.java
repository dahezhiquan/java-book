package multithreading;

/**
 * 通知线程中止
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        TTT ttt = new TTT();
        ttt.start();
        Thread.sleep(5000);
        // 主线程通知其他线程退出
        ttt.setLoop(false);
    }
}

class TTT extends Thread {
    // 控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("TTT线程正在运行...");
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
