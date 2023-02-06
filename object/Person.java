package object;

/**
 * Person类，对象方法，递归
 */
public class Person {
    String name;
    int age;
    String ID;

    // 一个普通的方法
    public void speak() {
        System.out.println("我是一个人");
    }

    // 计算 1 -- n 的和，使用传入的参数值
    public void cal(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }

    // 计算 a + b并返回结果
    public int add(int a, int b) {
        return a + b;
    }

    // 返回多个值，使用数组
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    // 方法递归调用
    public void showRecursion(int n) {
        if (n > 2) {
            showRecursion(n - 1); // 递归调用
        }
        System.out.println("n=" + n);
    }

    // 求阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    // 递归求斐波那契数列
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // 猴子吃桃问题
    public int monkey(int day) {
        if (day == 10) { // 第10天只剩一个桃子了
            return 1;
        } else {
            return (monkey(day + 1) + 1) * 2;
        }
    }
}
