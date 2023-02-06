package intermediateobject.polymorphicarray;

public class Test {
    public static void main(String[] args) {
        // 多态数组的使用
        Person[] persons = new Person[5];
        persons[0] = new Person("dahe", 20);
        persons[1] = new Student("wangwei", 11, 100);
        persons[2] = new Student("zhangsan", 12, 60);
        persons[3] = new Teacher("wang", 33, 15000);
        persons[4] = new Teacher("li", 55, 25000);

        // 循环遍历多态数组，调用say方法
        for (int i = 0; i < persons.length; i++) {
            String out = persons[i].say(); // 动态绑定机制，编译类型永远都是Person
            // 运行类型是根据实际情况由JVM机决定
            System.out.println(out);
            if (persons[i] instanceof Student) {
                // 向下转型
                Student student = (Student) persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }
        }
    }
}
