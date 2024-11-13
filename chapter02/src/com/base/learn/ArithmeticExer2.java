package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/3
 */
public class ArithmeticExer2 {
    public static void main(String[] args) {
        int num = 1234;

        int qian = num / 1000 % 10;
        int bai = num / 100 % 10;
        int shi = num / 10 % 10;
        int ge = num % 10;

        System.out.println("千位为：" + qian);
        System.out.println("百位为：" + bai);
        System.out.println("十位为：" + shi);
        System.out.println("个位为：" + ge);
    }
}
