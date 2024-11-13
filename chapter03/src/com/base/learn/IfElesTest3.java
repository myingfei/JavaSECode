package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/4/5
 */

/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆跑车；
成绩为(80，99]时，奖励一辆山地自行车；
当成绩为[60,80]时，奖励环球影城一日游；
其它时，胖揍一顿。
说明：默认成绩是在[0,100]范围内
 */
public class IfElesTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩[0,100]：");
        int score = scanner.nextInt();
        // 默认成绩范围为[0,100]
        if (score == 100) {
            System.out.println("奖励一辆跑车");
        } else if (score > 80) {
            System.out.println("奖励一辆山地车");
        } else if (score > 60) {
            System.out.println("奖励环球影城玩一日游");
        } else {
            System.out.println("胖揍一顿");
        }
        scanner.close();
    }
}
