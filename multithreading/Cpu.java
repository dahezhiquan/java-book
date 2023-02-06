package multithreading;

/**
 * 查看当前计算机有几核
 */
public class Cpu {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 获取当前电脑的CPU数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
