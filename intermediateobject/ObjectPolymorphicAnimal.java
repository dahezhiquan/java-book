package intermediateobject;

/**
 * 对象多态的父类
 */
public class ObjectPolymorphicAnimal {
    int year = 2022;
    public void cry() {
        System.out.println("Animal的cry被调用！");
    }
    public void show() {
        System.out.println("我是父类的show方法");
    }
}
