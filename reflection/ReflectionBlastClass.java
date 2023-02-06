package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射爆破案例，创建实例
 */
public class ReflectionBlastClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 获取User类的Class对象
        Class<?> userClass = Class.forName("reflection.User");
        // 通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        // 通过public的有参构造器创建实例
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object ww = constructor.newInstance("王伟");
        System.out.println(ww);
        // 通过非public的有参构造器创建实例
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        // 开启爆破模式
        declaredConstructor.setAccessible(true);
        Object ddd = declaredConstructor.newInstance(12, "ddd");
        System.out.println(ddd);
    }
}

class User {
    private int age = 21;
    private String name = "dahe";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}