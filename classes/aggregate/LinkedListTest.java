package classes.aggregate;

import java.util.LinkedList;

/**
 * LinkedList
 */
public class LinkedListTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // 增
        linkedList.add(521);
        linkedList.add(1314);
        System.out.println(linkedList);
        // 删除头节点
        linkedList.remove();
        System.out.println(linkedList);
        // 修改
        linkedList.set(0,999);
        System.out.println(linkedList);
        // 查找
        System.out.println(linkedList.get(0));
    }
}
