package com.base5._polymorphism.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}
