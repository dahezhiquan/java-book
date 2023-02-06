package advanced.draw;

import javax.swing.*;
import java.awt.*;

/**
 * java绘制简单圆形
 * 继承JFrame框架
 */
public class DrawCircle extends JFrame{
    // 定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        // 初始化面板
        mp = new MyPanel();
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
class MyPanel extends JPanel {
    // 定制画板初始化
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 画圆
        // 参数一：圆或椭圆四周包围的矩阵的左上角x坐标
        // 参数二：圆或椭圆四周包围的矩阵的左上角y坐标
        // 参数三：圆或椭圆的宽度
        // 参数四：圆或椭圆的高度
        g.drawOval(10,10,100,100);
    }
}