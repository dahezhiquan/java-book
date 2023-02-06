package intermediateobject.polymorphicparameter;

/**
 * 多态参数测试类
 */
public class Test {
    public static void main(String[] args) {
        Worker zhang = new Worker("张工",1000);
        Manager milan = new Manager("milan", 5000, 2000);
        Test test = new Test();
        test.showEmpAnnual(zhang);
        test.showEmpAnnual(milan);
        test.testWork(zhang);
        test.testWork(milan);
    }


    // 获取员工的年薪，采用多态参数
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work(); // 向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
