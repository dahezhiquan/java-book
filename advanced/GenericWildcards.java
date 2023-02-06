package advanced;

import java.util.List;

/**
 * 泛型继承和通配符
 */
public class GenericWildcards {
    public static void main(String[] args) {

    }
    /**
     * 任意泛型类型
     */
    public static void printCollection(List<?> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    /**
     * ? extends 表示上限，如下代表可以接受AA或者AA的子类
     */
    public static void printCollection2(List<? extends AA>c){
        for (AA aa : c) {
            System.out.println(aa);
        }
    }

    /**
     * ? super 表示下限，如下表示支持AA类以及AA类的父类，不限于直接父类
     */
    public static void printCollection3(List<? super AA>c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}