package com.base2._extends;

/**
 * @Author myf15609
 * @Date 2024/8/25
 */
public class extendsTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello();
        System.out.println("---------");

        Father father = new Father();
        father.sayHello();
        System.out.println("---------");

        Father father1 = new Son();
        father1.sayHello(); // Hello Son 多态
    }
}

class Father {
    int x = 10;
    String name = "Father";

    public void sayHello() {
        System.out.println("Hello Father");
    }
}

class Son extends Father {
    int y = 20;

    @Override
    public void sayHello() {
        System.out.println("Hello Son");
    }
}