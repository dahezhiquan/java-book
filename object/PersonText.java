package object;

/**
 * Person测试类
 */
public class PersonText {
    public static void main(String[] args) {
        Person person = new Person();
        person.speak(); // 调用普通方法
        person.cal(100); // 调用一个方法，并传给该方法一个值
        int addRes = person.add(10, 20); // 调用一个方法，并接受该方法的返回值
        System.out.println(addRes);
        // 返回值接受数组
        int[] resArr = person.getSumAndSub(30,10);
        for (int i : resArr) {
            System.out.println(i);
        }

        // 测试递归调用
        person.showRecursion(4);
        int factorialRes = person.factorial(5);
        System.out.println(factorialRes);
        int fibonacciRes = person.fibonacci(7);
        System.out.println(fibonacciRes);
        int monkeyRes = person.monkey(1);
        System.out.println(monkeyRes);
    }
}
