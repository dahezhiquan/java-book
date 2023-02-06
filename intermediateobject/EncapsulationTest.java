package intermediateobject;

/**
 * 封装的测试类
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("dahe");
        encapsulation.setAge(22);
        encapsulation.setSal(15000.00);
        String enRes = encapsulation.toString();
        System.out.println(enRes);
    }
}
