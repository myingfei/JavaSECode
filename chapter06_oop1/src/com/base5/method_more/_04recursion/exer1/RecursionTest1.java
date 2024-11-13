package com.base5.method_more._04recursion.exer1;

/**
 * 已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0 的整数，求f(10)的值。
 * @Author myf15609
 * @Date 2023/8/10
 */
public class RecursionTest1 {
    public static void main(String[] args) {
        RecursionTest1 test1 = new RecursionTest1();
        int a = test1.f(10);
        System.out.println(a); // 10497

    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
