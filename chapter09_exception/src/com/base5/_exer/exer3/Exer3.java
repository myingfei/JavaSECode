package com.base5._exer.exer3;

/**
 * @Author myf15609
 * @Date 2023/9/10
 */
public class Exer3 {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Tom", -10);
            System.out.println(p1);
        } catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }

        Person p2 = new Person();
        p2.setName("Jerry");
        p2.setLifeValue(-10);
        System.out.println(p2);
    }
}
