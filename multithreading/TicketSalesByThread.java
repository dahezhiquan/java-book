package multithreading;

/**
 * 多线程模拟售票，基于继承Thread
 * 会出现超卖现象！
 */
public class TicketSalesByThread {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        SellTicket sellTicket1 = new SellTicket();
        SellTicket sellTicket2 = new SellTicket();
        sellTicket.start();
        sellTicket1.start();
        sellTicket2.start();
    }
}


class SellTicket extends Thread {
    // 余票
    private static int ticketNum = 100;
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