package com.base4.example.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/9
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 18;
        p1.gender = '男';

        p1.study();
        System.out.println(p1.showAge());
        p1.addAge(5);

        System.out.println("p1 {" + "name='" + p1.name + '\'' + ", age=" + p1.age + ", gender=" + p1.gender + '}');

        System.out.println("-------------");

        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 30;
        p2.gender = '男';

        p2.study();
        System.out.println(p2.showAge());
        p2.addAge(2);

        System.out.println("p2 {" + "name='" + p2.name + '\'' + ", age=" + p2.age + ", gender=" + p2.gender + '}');


    }
}
