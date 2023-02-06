package advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * java注解
 */
public class Annotation {
    public static void main(String[] args) {
        Father father = new Father();
        father.hi();
    }
}
class Father {
    public void shit() {
        System.out.println("今天考了多少分啊？");
    }

    @Deprecated
    public void hi() {
        System.out.println("我过时了！");
    }

    // 用于抑制编译时的警告信息
    @SuppressWarnings("all")
    public static void testSu(){
        List list = new ArrayList();
    }
}

class Son extends Father {
    // 表示子类的shit方法重写了父类的shit方法
    // 主要的作用是编译校验，下面的方法没有实现重现编译器会报错
    @Override
    public void shit() {
        super.shit();
        System.out.println("考了59分！");
    }
}