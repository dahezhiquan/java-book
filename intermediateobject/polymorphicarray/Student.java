package intermediateobject.polymorphicarray;

/**
 * 多态数组学生子类
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    // 重写父类的say方法
    public String say() {
        return super.say() + '\t' + score;
    }

    public void study() {
        System.out.println("学生：" + getName() + "正在学习！");
    }
}
