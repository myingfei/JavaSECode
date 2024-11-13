package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/2/1
 * 使用 do-while 遍历100以内所有的偶数，并计算所有偶数的和和偶数的个数
 */
public class DoWhlieTest {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        int count = 0;

        do {
            if (number % 2 == 0) {
                System.out.println(number);
                sum += number;
                count++;
            }
            number++;
        } while (number <= 100);
        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
    }
}
