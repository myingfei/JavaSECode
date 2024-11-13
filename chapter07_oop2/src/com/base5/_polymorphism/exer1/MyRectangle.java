package com.base5._polymorphism.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWudth() {
        return width;
    }

    public void setWudth(double wudth) {
        this.width = wudth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 计算矩形的面积
     * @return 面积
     */
    @Override
    public double findArea() {
        return width * height;
    }
}
