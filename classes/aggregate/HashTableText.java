package classes.aggregate;

import java.util.Hashtable;

/**
 * HashTable演示
 */
public class HashTableText {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john",100);
        hashtable.put("tom",250);
        hashtable.put("tom",1314);
        System.out.println(hashtable);
    }
}
