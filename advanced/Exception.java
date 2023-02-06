package advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常
 */
public class Exception {
    public static void main(String[] args) {
        // divideByZero();
        // nullPointerException();
        // arrayIndexOutOfBoundsException();
        // classCastException();
        // numberFormatException();
        // customException();
    }

    /**
     * 数学运算异常，示例：除0异常
     */
    public static void divideByZero() {
        // 引入异常的基本使用
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("我不会被执行！");
    }

    /**
     * 空指针异常
     */
    public static void nullPointerException() {
        String name = null;
        System.out.println(name.length());
    }

    /**
     * 数组越界异常
     */
    public static void arrayIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    /**
     * 类型转换异常
     */
    public static void classCastException() {
        A b = new B(); // 向上转型
        C c = (C) b;
    }

    /**
     * 数字格式不正常异常
     */
    public static void numberFormatException() {
        String name = "12我的";
        int num = Integer.parseInt(name);
    }

    /**
     * 文件流异常，throws演示
     */
    public static void fileErrorTest() throws FileNotFoundException {
        fileError();
    }
    public static void fileError() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://test.txt");
    }

    /**
     * 自定义异常
     */
    public static void customException() {
        int age = 12;
        if (!(age >= 18)) {
            throw new AgeException("您还未成年！");
        }
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

/**
 *  自定义异常
 */
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}