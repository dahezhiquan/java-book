package multithreading;

/**
 * 多线程模拟售票，基于实现Runnable接口
 * 依然存在超卖现象
 */
public class TicketSalesByRunnable {
    public static void main(String[] args) {
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("没有余票！");
                break;
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
}