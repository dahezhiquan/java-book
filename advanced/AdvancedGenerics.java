package advanced;

/**
 * 泛型的高阶使用方法
 */
public class AdvancedGenerics {
    public static void main(String[] args) {
        fly("保密",521);
        fly(12,true);
    }

    /**
     * 自定义泛型方法
     */
    static public <T, R> void fly(T t, R r) {
        System.out.println(t);
        System.out.println(r);
    }
}

/**
 * 自定义泛型类
 */
class Tiger<T, R, M> {
    String name;
    R r;
    M m;
    T t;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

/**
 * 自定义泛型接口
 */
interface IUsb<U, R> {
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}

/**
 * 继承接口时指定泛型接口的类型
 */
interface IA extends IUsb<String, Double> {

}

/**
 * 实现自定义的泛型接口
 */
class TTT implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

/**
 * 实现IUsb接口
 */
class III implements IUsb<Integer, String> {

    @Override
    public String get(Integer integer) {
        return null;
    }

    @Override
    public void hi(String s) {

    }

    @Override
    public void run(String r1, String r2, Integer u1, Integer u2) {

    }
}