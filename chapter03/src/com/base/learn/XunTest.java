package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2024/2/1
 * 从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
 */
public class XunTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请开始输入整数，输入0结束:");
        int positive_int = 0;
        int negative_int = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                positive_int++;
            } else if (number < 0) {
                negative_int++;
            } else
                break;
        }
        System.out.println("正整数的个数：" + positive_int);
        System.out.println("负整数的个数：" + negative_int);
    }
}
