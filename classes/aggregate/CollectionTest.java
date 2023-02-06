package classes.aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection接口的实现类
 * Java不提供直接继承自Collection的类，只提供继承于的子接口
 * 所以我们以ArrayList为例子演示Collection接口的抽象方法
 */
public class CollectionTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        // 添加
        list.add("dahe");
        list.add(521);
        list.add(true);
        System.out.println(list);
        // 删除
        // 删除第一个元素
        list.remove(0);
        // 删除指定的元素
        list.remove(true);
        System.out.println(list);
        // 查找
        System.out.println(list.contains(521));
        // 元素个数
        System.out.println(list.size());
        // 判空
        System.out.println(list.isEmpty());
        // 清空
        list.clear();
        // 添加多个元素（可以添加另一个实现了Collection接口的对象）
        ArrayList arrayList = new ArrayList();
        arrayList.add("tiktok直播");
        arrayList.add("tiktok广告投放");
        list.addAll(arrayList);
        System.out.println(list);
        // 查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        // 删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
