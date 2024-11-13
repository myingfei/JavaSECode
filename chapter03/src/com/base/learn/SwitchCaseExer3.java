package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/4/5
 */

/*
编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：

score>=90           等级:  A
70<=score<90        等级:  B
60<=score<70        等级:  C
score<60            等级:  D

方式一：使用if-else
方式二：使用switch-case:  score / 10:   0 - 10
 */
public class SwitchCaseExer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        int score = scanner.nextInt();

        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            default:
                grade = 'D';
        }
        System.out.println("学生成绩为" + score + ",对应的等级为" + grade);
        scanner.close();
    }
}
