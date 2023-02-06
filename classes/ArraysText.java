package classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 数组常用类
 */
public class ArraysText {
    public static void main(String[] args) {
        Integer[] integers = {1, 3, 2, 5, 4, 6, 7, 8, 9, 10};
        // 显示数组信息
        System.out.println(Arrays.toString(integers));
        // 排序，从小到大
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        // 实现定制排序，从大到小
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                // return i1 - i2; 从小到大
                // 返回值 > 0 还是 < 0 会影响整个排序的结果
                // 接口编程 + 动态绑定 + 匿名内部类的综合使用
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers));
        // 二分搜索
        Integer[] arr = {1,3,5,7,9,11,13};
        int index = Arrays.binarySearch(arr,5);
        System.out.println(index);
        // 数组复制
        Integer[] temp = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(temp));
        // 数组填充
        Integer[] newArr = {1,2,3};
        // 将数组中所有元素置为521
        Arrays.fill(newArr,521);
        System.out.println(Arrays.toString(newArr));
        // 数组比较
        System.out.println(Arrays.equals(arr,newArr));
        // 转list
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        System.out.println(list);
    }
}
