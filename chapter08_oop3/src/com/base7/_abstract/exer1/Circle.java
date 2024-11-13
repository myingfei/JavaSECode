package com.base7._abstract.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String clolr, double weight, double radius) {
        super(clolr, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
