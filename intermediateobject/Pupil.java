package intermediateobject;

/**
 * 小学生，继承父类的子类
 */
public class Pupil extends Inherit {
    // 子类的无参构造
    public Pupil() {
        System.out.println("子类的无参构造执行~");
    }

    // 小学生独有的方法
    public void say() {
        System.out.println("爱你孤身走暗巷~");
    }
}
