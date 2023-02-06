package intermediateobject;

/**
 * 继承演示的测试类
 */
public class InheritTest {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setName("王强");
        pupil.setAge(12);
        pupil.setScore(100);
        pupil.say();
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.setName("大河");
        graduate.setAge(22);
        graduate.setScore(60);
        graduate.say();
        graduate.showInfo();
    }
}
