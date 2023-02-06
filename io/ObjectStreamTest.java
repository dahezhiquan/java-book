package io;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 演示ObjectOutputStream与ObjectInputStream
 */
public class ObjectStreamTest {
    public static void main(String[] args) {

    }

    /**
     * ObjectOutputStream进行序列化
     */
    @Test
    public void Out() throws IOException {
        String filePath = "D:\\data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(5.21);
        oos.writeUTF("云安全");
        oos.writeObject(new Dog("大贺", 10));
        oos.close();
        System.out.println("数据序列化成功！");
    }

    /**
     * ObjectInputStream反序列化
     */
    @Test
    public void Input() throws IOException, ClassNotFoundException {
        String filePath = "D:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        // 开始读取bat文件
        // 注意：读取顺序要和序列化时的顺序一致！
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog);
        // 访问dog的私有属性
        Dog dog1 = (Dog) dog;
        System.out.println(dog1.getName());
        // 关闭外层流
        ois.close();
    }
}

// Dog 需要实现Serializable接口才可以支持序列化操作
class Dog implements Serializable {
    private String name;
    private int age;
    @Serial
    private static final long serialVersionUID = 1L;

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