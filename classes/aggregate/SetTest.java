package classes.aggregate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口方法
 */
public class SetTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        // 添加
        set.add("dahe");
        set.add("wangwei");
        set.add(521);
        set.add(521);
        set.add(null);
        System.out.println(set);
        // 遍历Set
        // 迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        // 增强for
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
