package com.base7._abstract.exer3;

/**
 * @Author myf15609
 * @Date 2023/11/11
 */
public class AnonymityTest2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1() {
            @Override
            public void eat() {
                System.out.println("创建了一个匿名子类的对象p1，由于 Person1 是抽象类，子类必须重写父类的抽象方法");
            }
        };
        method(p1);

        System.out.println("----------------------");
        method(new Person1() {
            @Override
            public void eat() {
                System.out.println("创建了匿名子类的匿名对象，由于 Person1 是抽象类，子类必须重写父类的抽象方法");
            }
        });
    }
    public static void method(Person1 person1) {
        person1.eat();
    }
}

abstract class Person1 {
    public abstract void eat();
}