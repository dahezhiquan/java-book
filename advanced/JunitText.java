package advanced;

import org.junit.jupiter.api.Test;

/**
 * 单元测试Junit工具使用
 * 注意，此功能需要引入Junit的依赖才能进行使用
 * 如果您不会加载Junit的依赖，可以参考此篇文章：
 * https://blog.csdn.net/Gherbirthday0916/article/details/126064089?spm=1001.2014.3001.5502
 */
public class JunitText {
    public static void main(String[] args) {

    }

    @Test
    public void show() {
        System.out.println("业务内容");
    }

    @Test
    public void hi() {
        System.out.println("hi，欢迎来到...");
    }
}
