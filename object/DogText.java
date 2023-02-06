package object;

/**
 * Dog类的测试类
 */
public class DogText {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 实例化类对象
        dog.breed = "斗牛犬";
        dog.size = 3;
        dog.age = 5;
        dog.colour = "浅灰色";

        // 访问对象的属性
        System.out.println(dog.breed);
        // 访问对象的方法
        dog.eat();

        // 类赋值
        Dog dog1 = dog; // 把dog赋值给dog1，本质上是内存的指向
        System.out.println(dog1.age);
    }
}
