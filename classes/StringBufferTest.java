package classes;

/**
 * StringBuffer类
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // 创建一个大小为16的char[] 数组，用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        // 指定char[]容量大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        // 通过给一个string创建stringbuffer，初始容量为字符串长度 + 16
        StringBuffer dahezhiquan = new StringBuffer("dahezhiquan");

        // String --> StringBuffer
        String str = "hello";
        // 方法一：通过构造器
        StringBuffer stringBuffer2 = new StringBuffer(str);
        // 方法二：通过append
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);

        // StringBuffer --> String
        StringBuffer stringBuffer4 = new StringBuffer("lsp");
        // 方法一：通过toString方法
        String s = stringBuffer4.toString();
        // 方法二：使用构造器
        String s1 = new String(stringBuffer4);

        // StringBuffer的常用方法
        StringBuffer imustctf = new StringBuffer("imustctf");
        // 追加操作
        imustctf.append(" nice");
        imustctf.append(" yes").append(true).append(5.21).append(1314);
        System.out.println(imustctf);
        // 删除操作
        // 删除索引为5到6的字符
        imustctf.delete(5,7);
        System.out.println(imustctf);
        // 修改操作，替换9到10的字符为方文杰
        imustctf.replace(9,11,"方文杰");
        System.out.println(imustctf);
        // 查找操作
        int index = imustctf.indexOf("方文杰");
        System.out.println(index);
        // 插入操作，在索引为9的后面插入张三
        imustctf.insert(9,"张三");
        System.out.println(imustctf);
        // 长度
        System.out.println(imustctf.length());
    }
}
