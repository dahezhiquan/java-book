package classes.aggregate;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet
 */
public class TreeSetText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // TreeSet的简单使用
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeSet.add("tom");
        treeSet.add("lili");
        treeSet.add("kangkang");
        treeSet.add("abc");
        treeSet.add("tom");
        System.out.println(treeSet);

        // 根据字符串长度进行排序
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet1.add("tom");
        treeSet1.add("lili");
        treeSet1.add("wangwei");
        treeSet1.add("wu");
        treeSet1.add("zhan");
        System.out.println(treeSet1);
    }
}
