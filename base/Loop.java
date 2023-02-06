package base;

/**
 * 循环
 */
public class Loop {
    public static void main(String[] args) {
        // for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("你好世界！");
        }

        // while循环
        int j = 10;
        while (j < 20) {
            System.out.println(j);
            j++;
        }

        // do...while循环
        int x = 10;
        do {
            System.out.println("value of x : " + x);
            x++;
        } while (x < 10);

        // 多重循环
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println("我爱你！");
            }
        }

        // break关键字
        for (int c = 1; c <= 10; c++) {
            System.out.println(c);
            if (c == 3) {
                break;
            }
        }

        // continue关键字
        for (int d = 1; d < 5; d++) {
            if (d % 2 == 1) {
                continue;
            }
            System.out.println(d);
        }

        // return
        for (int e = 1; e < 5; e++) {
            System.out.println("IMUSTCTF越办越好！");
            if (e == 3) {
                return; // 直接退出程序
            }
        }
    }
}
