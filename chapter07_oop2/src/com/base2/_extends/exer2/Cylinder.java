package com.base2._extends.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return findArea() * length;
    }
}
