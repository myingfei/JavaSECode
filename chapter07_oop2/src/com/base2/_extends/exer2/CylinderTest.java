package com.base2._extends.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.2);
        cylinder.setLength(5.5);

        System.out.println("圆的面积为：" + cylinder.findArea());
        System.out.println("圆柱体的体积为：" + cylinder.findVolume());
    }
}
