package com.base.learn;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 字符串的判断需要使用String的equals()
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的网名：");
        String name = scanner.next();

        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();

        System.out.println("你是否单身（true / false）：");
        boolean isSingle = scanner.nextBoolean();

        System.out.println("请输入的你的性别：");
        char gender = scanner.next().charAt(0);

        System.out.println("你的基本信息如下：");
        System.out.println("网名：" + name + "\n年龄：" + age + "\n体重：" + weight + "\n单身：" + isSingle + "\n性别：" + gender);

        scanner.close();
    }
}
