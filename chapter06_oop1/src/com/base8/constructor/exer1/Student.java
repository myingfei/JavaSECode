package com.base8.constructor.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/17
 */
public class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this(name, age);
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this(name, age, school);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
