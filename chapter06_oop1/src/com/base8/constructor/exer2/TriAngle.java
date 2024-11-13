package com.base8.constructor.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/17
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return base * height / 2;
    }

}
