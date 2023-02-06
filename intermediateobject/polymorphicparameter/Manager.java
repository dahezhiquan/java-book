package intermediateobject.polymorphicparameter;

/**
 * 多态参数 - 经理子类
 */
public class Manager extends Employee{
    private double bonus; // 奖金

    public Manager(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理：" + getName() + "正在管理！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
