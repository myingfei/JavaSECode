package com.base3._override.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Cylinder extends Circle {
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

    /**
     * 圆柱的体积
     * @return 体积
     */
    public double findVolume() {

        return super.findArea() * length;
    }

    /**
     * 圆柱的表面积
     * @return 表面积
     */
    @Override
    public double findArea() {
        return super.findArea() * 2 + 2 * 3.14 * getRadius() * getLength();
    }
}
