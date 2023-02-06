package reflection;

/**
 * 获取Class对象的六种方式
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        String classAllPath = "reflection.Cat";
        // 1.forName获取。多用于配置文件读取类的全路径，加载类

        // 2.类名.class。多用于参数传递
        System.out.println(String.class);
        System.out.println(Cat.class);

        // 3.对象.getClass。适用于已经存在对象实例的情况
        Cat cat = new Cat();
        System.out.println(cat.getClass());

        // 4.通过类加载器获取Class对象
        // （1）得到类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        // （2）通过类加载器得到Class对象
        Class<?> cls = classLoader.loadClass(classAllPath);
        System.out.println(cls);

        // 5.基本数据类型通过.class获取Class对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);

        // 6.基本数据类型的包装类可以通过.TYPE得到Class对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
    }
}
