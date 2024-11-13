package com.base2.memory;

/**
 * @Author myf15609
 * @Date 2023/4/12
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建第一个对象
        Person p1 = new Person();
        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';

        System.out.println("name = " + p1.name + ", age = " + p1.age + ", gender = " + p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("画画");

        // 创建第二个对象

        Person p2 = new Person();
        p2.name = "露丝";
        p2.age = 18;
        p2.gender = '女';

        System.out.println("name = " + p2.name + ",age = " + p2.age + ", gender = " + p2.gender);

    }
}
