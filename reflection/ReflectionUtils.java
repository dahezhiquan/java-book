package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) throws ClassNotFoundException {
        // 得到Class对象
        Class<?> personCls = Class.forName("reflection.Person");
        // 得到全类名
        System.out.println(personCls.getName());
        // 得到简单类名
        System.out.println(personCls.getSimpleName());
        // 获取所有的public修饰的属性，包含父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        // 获取本类的所有属性，不包含父类
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            // 打印属性名字和等级和类型
            // 默认：0，public：1，private：2，protected：4，static：8，final：16
            System.out.println(declaredField.getName() + "\t" +
                    declaredField.getModifiers() + "\t" +
                    declaredField.getType());
        }
        // 获取所有public方法，包含父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        // 获取本类的所有方法和等级和返回类型和参数类型数组
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + "\t" +
                    declaredMethod.getModifiers() + "\t" +
                    declaredMethod.getReturnType());
            // 获取方法的参数类型数组
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }
        // 获取所有的public构造器，不包含父类的
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        // 获取所有的构造器，包含私有的，还有构造器的参数类型
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }
        // 返回包信息
        System.out.println(personCls.getPackage());
        // 以Class形式返回父类的信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println(superclass);
        // 以Class形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        // 返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

interface IA {

}

interface IB {

}

@Deprecated
class Person extends Something implements IA, IB {
    public String name;
    protected int level;
    private int age;
    String job;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int level, int age, String job) {
        this.name = name;
        this.level = level;
        this.age = age;
        this.job = job;
    }

    public void show(String content, int code) {

    }

    protected void hi() {

    }

    void say() {

    }

    private void hei() {

    }

}

class Something {
    public String hobby;
}