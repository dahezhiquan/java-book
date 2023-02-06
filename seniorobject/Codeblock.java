package seniorobject;

/**
 * 代码块
 */
public class Codeblock {
    private String name;
    private double price;
    private String director;
    {
        System.out.println("屏幕打开！");
        System.out.println("广告开始！");
        System.out.println("开始播放！");
    }

    public Codeblock(String name) {
        this.name = name;
    }

    public Codeblock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Codeblock(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
