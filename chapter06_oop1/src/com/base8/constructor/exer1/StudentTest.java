package com.base8.constructor.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/17
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 22, "清华大学");
        System.out.println(s1);

        Student s2 = new Student("李四", 18);
        System.out.println(s2);

    }
}
