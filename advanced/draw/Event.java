package advanced.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * java事件处理机制
 */
public class Event extends JFrame {
    private MyPanel3 mp = null;

    public static void main(String[] args) {
        Event event = new Event();
    }

    public Event() {
        // 初始化面板
        mp = new MyPanel3();
        // 把面板放入窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(400, 300);
        // 当点击窗口退出时，程序释放
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 可视化
        this.setVisible(true);
        // 设置监听mp键盘事件
        this.addKeyListener(mp);
    }
}

// KeyListener是一个监听器，可以监听键盘事件
class MyPanel3 extends JPanel implements KeyListener {
    int x = 10; // 小球的x坐标
    int y = 10; // 小球的y坐标

    // 定制画板初始化
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 画一个填充的小球
        g.fillOval(x, y, 20, 20);
    }

    // 有字符输出时，该方法就会被触发
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    // 当某个键按下，触发
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        // 用户按下不同的方向键，改变小球的坐标
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 5;
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            y -= 5;
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 5;
        } else {
            x += 5;
        }
        // 重绘面板
        this.repaint();
    }

    // 某个键释放，触发
    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
