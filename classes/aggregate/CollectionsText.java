package classes.aggregate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Collections工具类
 */
public class CollectionsText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tom");
        arrayList.add("king");
        arrayList.add("mimi");
        arrayList.add("kangkang");
        // 反转元素
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        // 随机排序
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        // 升序排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
        // 按照指定的比较器排序，比如按照字符串长度升序
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                return ((String) o).length() - ((String) t1).length();
            }
        });
        System.out.println(arrayList);
        // 交换元素位置，指定i和j位置的元素进行交换
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
        // 返回最大值，最小值使用min
        System.out.println(Collections.max(arrayList));
        // 自定义比较器，返回最大值，例如返回字符串长度最长的
        Object maxObject = Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                return ((String) o).length() - ((String) t1).length();
            }
        });
        System.out.println(maxObject);
        // 统计集合中某一个元素出现的次数
        System.out.println(Collections.frequency(arrayList,"tom"));
        // 拷贝
        ArrayList arrayList1 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add("");
        }
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);
        // 替换
        Collections.replaceAll(arrayList,"tom","汤姆");
        System.out.println(arrayList);
    }
}
