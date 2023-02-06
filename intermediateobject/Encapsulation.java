package intermediateobject;

/**
 * 三大特性：封装
 */
public class Encapsulation {
    public String name; // 名字公开
    private int age;
    private double sal;

    public Encapsulation() {
    }

    public Encapsulation(String name, int age, double sal) {
        // 保证了数据的封装性
        setName(name);
        setAge(age);
        setSal(sal);
    }

    // 进行封装操作
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 很方便的就可以加入对于数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("不要搞破坏哦！");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 这里对数据的正确性做判断
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("您还未成年！");
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    // 返回属性的信息
    @Override
    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
