package com.base5._polymorphism.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());

    }

    public void method(Person e) {
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }

        if (e instanceof Student) {
            System.out.println("a Student");
        }

        if (e != null) {
            System.out.println("a person");
        }
    }
}
