package com.base5._polymorphism.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计算圆的面积
     * @return 圆的面积
     */
    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
