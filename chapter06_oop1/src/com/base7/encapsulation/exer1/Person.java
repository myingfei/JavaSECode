package com.base7.encapsulation.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/16
 */
public class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        }else {
            System.out.println("您输入的数据非法");
        }
    }

    public int getAge() {
        return age;
    }
}
