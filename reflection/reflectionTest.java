package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射入门
 * 通过字符串形式的类的路径和方法信息调用类的方法
 */
public class reflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 类的路径
        String classPath = "reflection.Cat";
        // 要执行类的方法名称
        String classMethod = "hi";
        // 加载类
        Class cls = Class.forName(classPath);
        // 通过cls得到你加载的类Cat的对象实例
        Object o = cls.newInstance();
        // 查看o的运行类型，为Cat类型
        System.out.println(o.getClass());
        // 得到加载的类的方法对象
        // 在反射中，可以把方法视为对象
        Method method = cls.getMethod(classMethod);
        // 在反射调用方法时，取消访问检测
        method.setAccessible(true);
        // 通过method实例调用方法：即通过方法对象来实现调用方法
        method.invoke(o);

        // 得到name字段的信息
        // 注意：getField不能得到私有的属性信息
        Field nameField = cls.getField("name");
        System.out.println(nameField.get(o));

        // 得到构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);


    }
}
