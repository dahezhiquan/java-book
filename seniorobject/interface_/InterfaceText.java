package seniorobject.interface_;

/**
 * 接口测试类
 */
public class InterfaceText {
    public static void main(String[] args) {
        // 创建手机与相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        // 创建工作计算机
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);

        // 接口的多态传递机制
        // 接口类型的变量可以指向实现了该接口的类的对象实例
        TextB textB = new Teacher();
        // 如果TextB继承了TextA接口，而Teacher实现了TextB接口
        // 那么实际上相当于Teacher类也实现了TextA接口
        TextA textA = new Teacher();
    }
}

/**
 * 接口的多态传递机制
 */
interface TextA {}
interface TextB extends TextA {}
class Teacher implements TextB {}
