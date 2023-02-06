package classes.aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器
 */
public class IteratorTest {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义","罗贯中",52.7));
        col.add(new Book("小李飞刀","古龙",10.2));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        System.out.println(col);
        // 使用迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            // 返回下一个元素，类型是Object
            Object obj = iterator.next();
            System.out.println(obj);
        }
        for (Object o : col) {
            System.out.println(o);
        }
    }
}

class Book {
    private String name;
    private String author;
    private Double price;

    public Book(String name, String author, Double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}