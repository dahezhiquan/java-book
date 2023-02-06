package base;

import java.util.Scanner;

/**
 * 键盘输入
 */
public class Input {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 接受用户的输入
        System.out.println("请输入你的名字：");
        String name = scanner.next();
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入你的月薪：");
        double sal = scanner.nextDouble();
        System.out.println("姓名：" + name + ";年龄：" + age + ";月薪：" + sal);
    }
}
