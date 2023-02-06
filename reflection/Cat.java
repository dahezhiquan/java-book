package reflection;

public class Cat {
    public String name = "豹猫";
    public String age;

    public void hi() {
        System.out.println("喵喵喵~");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
