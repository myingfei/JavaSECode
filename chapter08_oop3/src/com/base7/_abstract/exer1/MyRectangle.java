package com.base7._abstract.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String clolr, double weight, double width, double height) {
        super(clolr, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
