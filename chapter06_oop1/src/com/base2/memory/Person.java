package com.base2.memory;

/**
 * @Author myf15609
 * @Date 2023/4/12
 */
public class Person {

    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep(int hour) {
        System.out.println("人至少保证每天" + hour + "小时的睡眠 💤");
    }

    public void interests(String hobby) {
        System.out.println("我的爱好是：" + hobby);
    }
}
