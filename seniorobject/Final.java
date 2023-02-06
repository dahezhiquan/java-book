package seniorobject;

/**
 * final关键字
 */
public class Final {
    public static void main(String[] args) {

    }
}

// 希望A类不能被其他类继承
final class A {
}

class B {
    // 不希望类的某个属性值被修改（常量）
    public final double TAX_RATE = 0.007;
    // 希望该方法不能被子类覆盖或者重写
    final public void hi() {
        // 不希望某个局部变量被修改
        final int TIMES = 10;
        System.out.println("你好，ByteDance！");
    }
}