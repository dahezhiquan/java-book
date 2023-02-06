package classes.aggregate;

/**
 * List接口，Collection接口的子接口
 */

import java.util.ArrayList;
import java.util.List;


public class ListTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList();
        list1.add("ceshi");
        list1.add("tangseng");
        // 添加元素
        list.add("dahe");
        list.add("tom");
        list.add("dahe"); // 可以重复
        // 指定位置插入元素
        list.add(1, "qian");
        // 加入多个元素，传入一个Collection对象
        list.addAll(1, list1);
        System.out.println(list);
        // 取出指定索引的元素
        System.out.println(list.get(0));
        // 查找元素第一次出现的位置
        System.out.println(list.indexOf("dahe"));
        // 查找元素最后一次出现的位置
        System.out.println(list.lastIndexOf("dahe"));
        // 删除元素
        list.remove(1);
        System.out.println(list);
        // 元素替换
        list.set(1, "marry");
        System.out.println(list);
        // 返回子集合，0到1的元素集合
        List returnList = list.subList(0, 2);
        System.out.println(returnList);
    }
}
