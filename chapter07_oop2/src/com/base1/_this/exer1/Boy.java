package com.base1._this.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println(girl.getName());
    }
    public void shout() {
        if (this.age >= 22) {
            System.out.println("可以结婚");
        }else {
            System.out.println("只能谈恋爱");
        }
    }
}
