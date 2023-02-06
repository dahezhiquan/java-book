package classes.aggregate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map
 */
public class MapTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        // 添加键值对
        map.put("no1","dahe");
        map.put("no2","zhangsan");
        // Key重复会进行替换
        map.put("no1","lisi");
        System.out.println(map);

        // 根据键删除映射关系
        map.remove("no1");
        System.out.println(map);
        // 根据key得到值
        Object no2 = map.get("no2");
        System.out.println(no2);
        // 获取键值对数量
        System.out.println(map.size());
        // 判空
        System.out.println(map.isEmpty());
        // 清空
        // map.clear();
        // 查找键是否存在
        System.out.println(map.containsKey("ok"));

        // k-v存在有EntrySet的一个指向
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Map接口的遍历方式
        // 取出所有的key，通过key取出对应的value
        Set keySet = map.keySet();
        for (Object o : keySet) {
            System.out.println(o);
            System.out.println(map.get(o));
        }
        // 把所有的value值取出
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        // 通过EntrySet来获取 k-v
        Set entrySet1 = map.entrySet();
        for (Object o : entrySet1) {
            // 将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }
}
