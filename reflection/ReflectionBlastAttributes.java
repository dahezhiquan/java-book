package reflection;

import java.lang.reflect.Field;

/**
 * 反射爆破案例，爆破属性
 */
public class ReflectionBlastAttributes {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> stuClass = Class.forName("reflection.Student");
        // 创建一个对象
        Object o = stuClass.newInstance();
        Field age = stuClass.getField("age");
        // 操作公有属性
        age.set(o, 99);
        System.out.println(o);
        // 操作私有静态属性
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        // 也可以写为name.set(null, "昆仑云");
        name.set(o, "昆仑云");
        System.out.println(o);
        // 得到某一个属性
        System.out.println(age.get(o));
        System.out.println(name.get(null));
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + "\tname=" + name +
                '}';
    }
}