package com.base7.encapsulation.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/16
 */
public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setBookName("Java核心技术");
        b.setAuthor("凯·霍斯特曼");
        b.setPrice(80.5);
        System.out.println(b);
    }
}
