package com.base7._abstract.exer3;

/**
 * @Author myf15609
 * @Date 2023/11/11
 */
public class AnonymityTest {
    public static void main(String[] args) {
        Person p = new Person();
        method(p);

        // 匿名对象
        method(new Person());

        // 匿名子类对象
        Person p2 = new Person() {
            @Override
            public void eat() {
                System.out.println("人吃饭，匿名子类对象");
            }
        };
        method(p2);

        // 匿名子类的匿名对象创建
        method(new Person() {
            @Override
            public void eat() {
                System.out.println("人吃饭，匿名子类的匿名对象创建");
            }
        });
    }

    public static void method(Person person) {
        person.eat();
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void breath() {
        System.out.println("人呼吸");
    }
}