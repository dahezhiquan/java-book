package object;

/**
 * 方法重载，可变参数
 */
public class Overload {
    // 两个整数的和
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    // 整数 + 浮点数
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }

    // 浮点数 + 整数
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }

    // 三个整数和
    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // 可变参数
    public int sum(int ... nums) {
        System.out.println(nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
