package classes.aggregate;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet
 */
public class HashSetText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        // 添加
        hashSet.add("dahe");
        // 添加成功，返回true，失败返回false
        System.out.println(hashSet.add("qian"));
        System.out.println(hashSet.add("qian"));
        System.out.println(hashSet);
        // 添加对象，以下是不同的对象
        hashSet.add(new DDD("aaa"));
        hashSet.add(new DDD("aaa"));
        System.out.println(hashSet);
        // 经典面试题，以下的两个只能添加一个
        hashSet.add(new String("hsp"));
        hashSet.add(new String("hsp"));
        System.out.println(hashSet);
    }
}

class DDD {
    private String name;

    public DDD(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DDD{" +
                "name='" + name + '\'' +
                '}';
    }
}