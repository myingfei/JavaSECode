package com.base12._wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;
/**
 * @Author myf15609
 * @Date 2023/9/3
 */
public class ScoreTest {
    public static void main(String[] args) {
        // 1. 实例化 Scanner 用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        // 2. 创建 Vector 对象
        Vector v = new Vector();

        // 3. 通过 for(;;) 或者 while(true) 的方式，给 Vector 中添加数据
        int maxScore = 0;
        for (; ; ) {
            System.out.print("请输入学生成绩（以负数代表输入结束）：");
            int score = scanner.nextInt();
            if (score < 0) break;
            if (score > 100) {
                System.out.println("输入的成绩有误，请重新输入：");
                continue;
            }
            // jdk 5.0 之前需要手动装箱
            // Integer integer = new Integer(score);
            // Integer integer = Integer.valueOf(score);
            // v.addElement(integer);

            // jdk 5.0 之后会自动装箱，直接写即可
            v.addElement(score);
            // 4. 获取学生成绩的最大值
            if (maxScore < score) maxScore = score;
        }
        // 5. 遍历 Vector 得到每个学生的成绩，并与最大值比较，得到学生成绩的等级
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            // jdk 5.0 之前需要手动拆箱
            // Integer intScore = (Integer) obj; // 强转为包装类
            // int score1 = intScore.intValue(); // 包装类转为基本数据类型

            // jdk 5.0 之后自动拆箱
            int score1 = (Integer) obj;
            if (maxScore - score1 < 10) {
                level = 'A';
            } else if (maxScore - score1 < 20) {
                level = 'B';
            } else if (maxScore - score1 < 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student - " + i + " score is " + score1 + ", level is " + level);
        }
        scanner.close();
    }
}
