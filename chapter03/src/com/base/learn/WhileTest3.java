package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2024/3/5
 * 猜数字游戏
 * 随机生成一个100以内的数，猜这个随机数是多少？
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 * 提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
 */
public class WhileTest3 {
    public static void main(String[] args) {
        // 获取一个随机数
        int random = (int)(Math.random() * 10 + 1);

        // 记录猜的次数
        int count = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数（1-10）:");
        int guess = scanner.nextInt();

        while (random != guess) {
            if (guess > random) {
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
            System.out.print("请输入一个整数（1-10）:");
            guess = scanner.nextInt();
            count++;
        }
        System.out.println("猜中了");
        System.out.println("一共猜了:" + count + "次");
        scanner.close();
    }
}
