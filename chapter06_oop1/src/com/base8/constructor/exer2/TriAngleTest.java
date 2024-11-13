package com.base8.constructor.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/17
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(3.5);
        t1.setHeight(6.3);
        System.out.println(t1.findArea());

        TriAngle t2 = new TriAngle(2.2, 4.5);
        System.out.println(t2.findArea());

    }
}