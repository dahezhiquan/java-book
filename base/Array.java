package base;

/**
 * 数组
 */
public class Array {
    public static void main(String[] args) {
        // 数组初始化创建
        // 第一种方式，声明并分配空间
        double[] scores = new double[5];
        scores[0] = 77;
        scores[1] = 78;
        scores[2] = 99;
        scores[3] = 100;
        scores[4] = 52;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 第二种方式，分步骤执行
        int apples[]; // 声明数组，还没有分配空间
        apples = new int[5]; // 分配空间
        // 第三种方式，静态初始化
        double[] hens = {3, 5, 1, 2.5, 7.8};
        for (int i = 0; i < hens.length; i++) {
            System.out.println(hens[i]);
        }

        // 数组的赋值机制，引用传递
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1; // 获得的其实是arr1的地址
        System.out.println(arr1);
        System.out.println(arr2);

        // 数组拷贝
        int[] a1 = {1,2,3};
        int[] a2 = new int[arr1.length]; // 开辟一个新的数组空间
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a2[i]);
        }

        // For-Each
        int[] dogs = {1,2,3,4,5};
        for (int dog : dogs) {
            System.out.println(dog);
        }

        // 二维数组
        int[][] doubleArr = {{1,2,3},{4,5,6},{7,8,9}};
        // 双重循环遍历
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                System.out.println(doubleArr[i][j]);
            }
        }
        // 动态创建二维数组
        int[][] arr = new int[3][];
    }
}
