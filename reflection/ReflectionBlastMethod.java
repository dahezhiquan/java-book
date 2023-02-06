package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射爆破案例，爆破方法
 */
public class ReflectionBlastMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossClass = Class.forName("reflection.Boss");
        Object o = bossClass.newInstance();
        // 反射爆破公有方法
        Method hi = bossClass.getMethod("hi", String.class);
        hi.invoke(o, "dahedahe");
        // 反射爆破私有静态方法
        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o, 12, "我的司机", 'a'));
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println(s);
    }
}