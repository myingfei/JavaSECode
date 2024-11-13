package com.base7.encapsulation.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/16
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return getName() + "\t" + getGender() + "\t" + getAge() + "\t" + getPhoneNumber();
    }
}
