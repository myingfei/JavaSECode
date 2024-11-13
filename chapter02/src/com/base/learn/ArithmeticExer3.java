package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/3
 */
public class ArithmeticExer3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i=" + i); // 10
        System.out.println("i1=" + i1);// 11
        i = ++i1;
        System.out.print("i=" + i);// 12
        System.out.println("i1=" + i1);// 12
        i = i2--;
        System.out.print("i=" + i);// 20
        System.out.println("i2=" + i2);// 19
        i = --i2;
        System.out.print("i=" + i);// 18
        System.out.println("i2=" + i2);// 18


        System.out.println("5+5=" + 5 + 5); //打印结果是:5+5=55

        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);//-128

        int i3 = 1;
        int j = i3++ + ++i3 * i3++; // 1 + 3 * 3
        System.out.println("j = " + j); // 10
    }
}
