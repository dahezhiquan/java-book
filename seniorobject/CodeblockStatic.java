package seniorobject;

/**
 * 静态代码块
 */
public class CodeblockStatic {
    {
        System.out.println("普通代码块执行~");
    }

    // 静态属性初始化
    private static int n = getN();

    static {
        System.out.println("静态代码块执行~");
    }

    public static int getN() {
        System.out.println("getN被调用");
        return 521;
    }

    public CodeblockStatic() {
        System.out.println("构造器执行~");
    }
}
