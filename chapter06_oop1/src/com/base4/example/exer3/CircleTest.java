package com.base4.example.exer3;

/**
 * 利用面向对象的编程方法，设计类 Circle 计算圆的面积
 * @Author myf15609
 * @Date 2023/4/12
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.3;
        System.out.println(c1.findArea());
    }
}
