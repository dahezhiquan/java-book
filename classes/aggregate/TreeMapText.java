package classes.aggregate;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * TreeMap演示
 */
public class TreeMapText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                return ((String) o).length() - ((String) t1).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","史密斯");
        System.out.println(treeMap);
    }
}
