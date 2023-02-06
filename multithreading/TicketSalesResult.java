package multithreading;

/**
 * 使用同步机制解决售票问题的超卖现象
 */
public class TicketSalesResult {
    public static void main(String[] args) {
        SellTicketRes sellTicketRes = new SellTicketRes();
        new Thread(sellTicketRes).start();
        new Thread(sellTicketRes).start();
        new Thread(sellTicketRes).start();
    }
}

class SellTicketRes implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;

    /**
     * 使用synchronized实现线程同步，解决超卖
     * 这时的锁在this对象
     */
    public void Sell() {
        synchronized (this) {
            if (ticketNum <= 0) {
                System.out.println("没有余票！");
                loop = false;
                return;
            }
            // 休眠卖票
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() +
                    "售出一张票。" + "剩余票数：" + (--ticketNum));
        }
    }
    @Override
     public void run() {
        while (loop) {
            Sell();
        }
    }
}