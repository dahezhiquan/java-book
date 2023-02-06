package seniorobject.innerclass;

/**
 * 匿名内部类的最佳实践
 */
public class AnonymousInnerClassPractice {
    public static void main(String[] args) {
        f(new IL() {
            @Override
            public void show() {
                System.out.println("你好啊");
            }
        });
    }

    public static void f(IL il) {
        il.show();
    }
}

interface IL {
    void show();
}
