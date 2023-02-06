package advanced.draw;

import javax.swing.*;
import java.awt.*;

/**
 * java绘制方法演示
 */
public class Draw extends JFrame{
    // 定义一个面板
    private MyPanel2 mp = null;
    public static void main(String[] args) {
        new Draw();
    }

    public Draw() {
        // 初始化面板
        mp = new MyPanel2();
        // 把面板放入窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(400,300);
        // 当点击窗口退出时，程序释放
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 可视化
        this.setVisible(true);
    }
}

/**
 * 定义一个画板
 * JPanel是java提供的一个绘图类
 */
class MyPanel2 extends JPanel {
    // 定制画板初始化
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 从（10，10）到（100，100）的直线
        // g.drawLine(10,10,100,100);

        // 矩形，左上角（10，10）右上角（100，100）
        // g.drawRect(10,10,100,100);

        // 填充矩形，填充蓝色矩形，同样也可以进行填充圆形或椭圆
        // g.setColor(Color.BLUE);
        // g.fillRect(10,10,100,100);

        // 画字
        // 给画笔染色
        g.setColor(Color.BLUE);
        // 设置字体
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("IMUSTCTF",70,100);
    }
}
