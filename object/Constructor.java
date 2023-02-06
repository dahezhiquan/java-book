package object;

/**
 * 构造方法
 */
public class Constructor {
    String name;
    int age;

    // 构造器，方法名和类名一致
    public Constructor(String pName, int pAge) {
        System.out.println("构造器被调用！");
        name = pName;
        age = pAge;
    }
    // 构造器的重载
    public Constructor(String pName){
        name = pName;
    }
}
