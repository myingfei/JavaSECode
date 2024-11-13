package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/2/1
 * 水仙花
 */
public class ForTest2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (a*a*a + b*b*b + c*c*c == i) {
                System.out.println("次数值满足水仙花：" + i);
                count++;
            }
        }
        System.out.println("水仙花数共有：" + count + "个");
    }
}
