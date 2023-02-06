package intermediateobject;

/**
 * 三大特性：继承演示的父类
 */
public class Inherit {
    // 共有的属性
    public String name;
    public int age;
    private double score; // 私有的方法
    // 共有的方法

    public String getName() {
        return name;
    }

    // 父类的无参构造
    public Inherit() {
        System.out.println("父类的无参构造执行~");
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生姓名：" + name + " 年龄：" + age +
                " 成绩：" + score);
    }
}
