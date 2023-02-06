package intermediateobject.polymorphicparameter;

/**
 * 多态参数 - 父类
 */
public class Employee {
    private String name;
    private double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    // 得到年工资的方法
    public double getAnnual() {
        return 12 * sal;
    }
}
