package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 遍历 1--100以内的偶数，并获取偶数的个数，获取所有偶数的和
 */
public class ForTest3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的和为：" + sum);
    }
}
