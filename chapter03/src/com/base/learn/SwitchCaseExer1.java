package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2024/6/30
 * 从键盘输入星期的整数值，输出星期的英文单词
 */
public class SwitchCaseExer1 {
    public static void main(String[] args) {
        // 定义指定的星期
        Scanner input = new Scanner(System.in);
        System.out.print("请输入星期值：");
        int weekday = input.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("你输入的星期值有误！");
                break;
        }
        input.close();
    }
}
