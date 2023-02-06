package advanced;

import java.util.ArrayList;

/**
 * java泛型
 */
public class Generics {
    public static void main(String[] args) {
        // 使用java泛型对数据类型做限制
        // 限制添加的类型必须为Dog
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("康康",12));
        arrayList.add(new Dog("旺旺",6));
        for (Dog dog : arrayList) {
            System.out.println(dog.getName());
            System.out.println(dog.getAge());
        }

        // 泛型特性的类
        Person<String> stringPerson = new Person<String>("www");
        System.out.println(stringPerson);
        Person<Integer> integerPerson = new Person<Integer>(521);
        System.out.println(integerPerson);
        // 推荐简写写法
        Person<Double> doublePerson = new Person<>(13.14);
        System.out.println(doublePerson);
        Person<Object> objectPerson = new Person<>("dahe");
        System.out.println(objectPerson);
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// 泛型类
class Person<E> {
    E s; // 在编译期间，确定E是什么类型

    public Person(E s) { // E可以是参数类型
        this.s = s;
    }

    public E f() { // E也可以是返回类型
        return s;
    }

    @Override
    public String toString() {
        return "Person{" +
                "s=" + s +
                '}';
    }
}