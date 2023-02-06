package seniorobject;

/**
 * 抽象类
 */
// 如果一个类包含抽象方法，那么该类一定要声明为抽象类
abstract class Abstract {
    // 抽象方法
    public abstract void eat();
}

abstract class Dog extends Abstract {
}

class Dinosaur extends Abstract {
    @Override
    public void eat() {
        System.out.println("我是恐龙，我爱吃肉！");
    }
}
