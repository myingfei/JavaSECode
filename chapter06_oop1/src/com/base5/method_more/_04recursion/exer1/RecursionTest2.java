package com.base5.method_more._04recursion.exer1;

/**
 * 已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * @Author myf15609
 * @Date 2023/8/10
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        RecursionTest1 test1 = new RecursionTest1();
        int a = test1.f(10);
        System.out.println(a); // 10497

    }

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }
}
