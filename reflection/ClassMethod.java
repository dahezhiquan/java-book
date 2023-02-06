package reflection;

import java.lang.reflect.Field;

/**
 * 演示Class类的常用方法
 */
public class ClassMethod {
    public static void main(String[] args) throws Exception {
        String classAllPath = "reflection.Cat";
        // 获取Cat类对应的Class对象
        Class<?> aClass = Class.forName(classAllPath);
        // 显示aClass对象是哪一个类的Class对象
        System.out.println(aClass);
        // 输出aClass对象的运行类型
        System.out.println(aClass.getClass());
        // 得到包名
        System.out.println(aClass.getPackage().getName());
        // 得到全类名
        System.out.println(aClass.getName());
        // 创建对象实例
        Cat cat = (Cat) aClass.newInstance();
        System.out.println(cat);
        // 通过反射获取属性
        Field name = aClass.getField("name");
        System.out.println(name.get(cat));
        // 通过反射给属性设置值
        name.set(cat,"汤圆");
        System.out.println(name.get(cat));
        // 得到所有的属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
