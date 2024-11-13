package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/4
 */
public class CompareLogicExer {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean bo1 = ((++a % 3) == 0) && ((a++ % 7) == 0);
        System.out.println("bo1的值：" + bo1); // true
        System.out.println("a的值：" + a); // 22
        System.out.println("----------------------------");

        boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0); // 左边为假，右边不参与运算
        System.out.println("bo2的值：" + bo2); // false
        System.out.println("b的值：" + b); // 21
    }
}
