package com.base4.example.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/9
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age += addAge;
    }

}
