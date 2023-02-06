package intermediateobject;

/**
 * 对象多态的子类 - 🐱
 */
public class ObjectPolymorphicCat extends ObjectPolymorphicAnimal{
    int year = 2021;
    public void cry() {
        System.out.println("喵喵喵~");
    }
    public void eatFish() {
        System.out.println("我爱吃鱼！");
    }
}
