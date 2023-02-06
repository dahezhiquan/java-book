package intermediateobject;
/**
 * 对象多态的测试类
 */
public class ObjectPolymorphicTest {
    public static void main(String[] args) {
        ObjectPolymorphicAnimal opa = new ObjectPolymorphicDog();
        opa.cry();
        // 改变引用的运行类型
        opa = new ObjectPolymorphicCat();
        opa.cry();
        opa.show();

        // 希望调用cat的eatFish方法，采用向下转型
        // 注意：此时的编译类型和运行类型都是ObjectPolymorphicCat
        ObjectPolymorphicCat cat = (ObjectPolymorphicCat) opa;
        cat.eatFish();

        // 多态中的属性，看编译类型
        System.out.println(opa.year);

        // instanceOf比较操作符
        System.out.println(opa instanceof ObjectPolymorphicCat);
        System.out.println(opa instanceof ObjectPolymorphicDog);
        System.out.println(opa instanceof ObjectPolymorphicAnimal);
    }
}
