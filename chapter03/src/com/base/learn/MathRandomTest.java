package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * Math.random()
 */
public class MathRandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println(d1);

        // 获取一个[0， 100]范围的随机整数
        int num1 = (int) (Math.random() * 101); // [0.0, 1.0) --> [0.0, 101.0) --> [0, 100]

        // 获取一个[1， 100]范围的随机整数
        int num2 = (int) (Math.random() * 100) + 1; // [0.0, 1.0) --> [0.0, 100.0) --> [0, 99] --> [1, 100]

        // 获取一个 [a, b] 范围的随机整数，举例 [4, 15]
        // (int)(Math.random()*(b - a + 1)) + a

        int num3 = (int) (Math.random() * (15 - 4 + 1)) + 4;
        System.out.println(num3);
    }
}
