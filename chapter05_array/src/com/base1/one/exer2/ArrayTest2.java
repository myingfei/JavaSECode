package com.base1.one.exer2;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        // 定义包含7个单词多数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // 从键盘获取指定的数值，使用 scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入[1-7]范围的整数：");
        int number = scanner.nextInt();

        // 针对获取的数据进行判断即可
        if (number < 1 || number > 7) {
            System.out.println("输入非法");
        } else {
            System.out.println("对应星期为：" + weeks[number - 1]);
        }
        scanner.close();
    }
}
