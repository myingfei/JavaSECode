package com.base5.method_more._04recursion.exer2;

/**
 * 斐波那契数列(Fibonacci)
 * 问：什么是斐波那契数列？
 * 答：一个数等于前两个数之和（例如：1 1 2 3 5 8 13 21 34 55）
 * 问题：计算斐波那契数列的第n个值
 * @Author myf15609
 * @Date 2023/8/10
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        RecursionTest2 test2 = new RecursionTest2();
        int a = test2.f(10);
        System.out.println(a); // 55

    }

    public int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
