package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/4/5
 */

/*
从键盘分别输入年、月、日，判断这一天是当年的第几天

注：判断一年是否是闰年的标准：
   1）可以被4整除，但不可被100整除
	  或
   2）可以被400整除

例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年
 */
public class SwitchCaseTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入year：");
        int year = scanner.nextInt();

        System.out.println("请输入month：");
        int month = scanner.nextInt();

        System.out.println("请输入day：");
        int day = scanner.nextInt();

        //声明一个变量days，用来存储总天数
        int sumDays = 0;

        //累加[1,month-1]个月满月天数
        switch (month) {
            case 12:
                sumDays += 30;//这个30是代表11月份的满月天数
            case 11:
                sumDays += 31;//这个31是代表10月的满月天数
            case 10:
                sumDays += 30;//9月
            case 9:
                sumDays += 31;//8月
            case 8:
                sumDays += 31;//7月
            case 7:
                sumDays += 30;//6月
            case 6:
                sumDays += 31;//5月
            case 5:
                sumDays += 30;//4月
            case 4:
                sumDays += 31;//3月
            case 3:
                sumDays += 28;//2月
                //在这里考虑是否可能是29天
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sumDays++;//多加1天
                }
            case 2:
                sumDays += 31;//1月
            case 1:
                sumDays += day;//第month月的day天
        }
        //输出结果
        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + sumDays + "天");
        scanner.close();
    }
}
