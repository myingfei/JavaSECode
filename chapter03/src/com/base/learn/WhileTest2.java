package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/3/5
 * 遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
 */
public class WhileTest2 {
    public static void main(String[] args) {
        // 遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
        int num = 1;
        int sum = 0; // 记录 1--100 所有偶数的和
        int count = 0; // 记录 1--100 所有偶数的个数
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的和为：" + sum);
    }
}
