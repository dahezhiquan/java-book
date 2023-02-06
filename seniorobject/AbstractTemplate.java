package seniorobject;

/**
 * 抽象模板设计模式
 */
abstract public class AbstractTemplate {
    public abstract void job(); // 加入抽象方法，父类的梦想子类完成

    // 得到代码运行时间
    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间：" + (end - start));
    }
}

// 子类实现父类的梦想
class AA extends AbstractTemplate{
    @Override
    public void job() {
        long num = 0;
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}

class BB extends AbstractTemplate {
    @Override
    public void job() {
        long num = 0;
        for (int i = 0; i < 500000; i++) {
            num += i;
        }
    }
}