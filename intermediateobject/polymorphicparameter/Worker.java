package intermediateobject.polymorphicparameter;

/**
 * 多态参数 - 子类员工
 */
public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    public void work() {
        System.out.println("普通员工：" + getName() + "正在工作！");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
