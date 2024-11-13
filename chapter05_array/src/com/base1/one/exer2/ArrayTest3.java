package com.base1.one.exer2;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/11/4
 * 拓展：一年12个月的存储
 * 用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
 * {"January","February","March","April","May","June","July","August","September","October","November","December"}
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        // 定义包含月份的单词
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // 从键盘获取指定的数值，使用 scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入[1-12]范围的整数：");
        int number = scanner.nextInt();

        // 针对获取的数据进行判断
        if (number < 1 || number > 12) {
            System.out.println("输入非法");
        } else {
            System.out.println("对应月份为：" + months[number - 1]);
        }
        scanner.close();
    }
}
