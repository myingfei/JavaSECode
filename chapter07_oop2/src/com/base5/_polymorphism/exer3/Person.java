package com.base5._polymorphism.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}
