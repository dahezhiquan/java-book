package classes.aggregate;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ArrayList
 */
public class ArrayListTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(521);
        arrayList.add(null);
        arrayList.add("武松");
        arrayList.add(null);
        System.out.println(arrayList);
    }
}
