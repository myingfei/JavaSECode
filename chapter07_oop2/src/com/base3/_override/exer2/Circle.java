package com.base3._override.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }
}
