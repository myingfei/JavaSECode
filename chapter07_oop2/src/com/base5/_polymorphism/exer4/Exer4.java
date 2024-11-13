package com.base5._polymorphism.exer4;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Exer4 {
    public static void main(String[] args) {
        meeting(new Man());
        System.out.println("-------");
        meeting(new Woman());
    }

    public static void meeting(Person person) {
        person.eat();
        person.toilet();
        if (person instanceof Man) {
            Man man = (Man) person;
            man.somke();
        }
        if (person instanceof Woman) {
            Woman woman = (Woman) person;
            woman.makeup();
        }
    }
}
