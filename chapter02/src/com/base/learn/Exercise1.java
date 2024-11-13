package com.base.learn;

/**
 * 圆的面积
 *
 * @Author myf15609
 * @Date 2023/4/2
 */
public class Exercise1 {
    public static void main(String[] args) {
        double PI = 3.14;

        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 6;

        System.out.println("第一个圆的面积：" + PI * radius1 * radius1);
        System.out.println("第二个圆的面积：" + PI * radius2 * radius2);
        System.out.println("第三个圆的面积：" + PI * radius3 * radius3);
    }
}

/*
第一个圆的面积：4.521599999999999
第二个圆的面积：19.625
第三个圆的面积：113.03999999999999
*/