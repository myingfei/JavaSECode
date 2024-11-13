package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/6/20
 */
public class BitExer {
    public static void main(String[] args) {
        int m = 10;
        int n = 5;

        System.out.println("m = " + m + ", n = " + n);

        double d1 = 12.3;
        System.out.println(d1 + 1);

        float f1 = 12.5F;
        System.out.println(f1);

        char c1 = 'a';
        System.out.println(c1);

        char c2 = '\n';
        System.out.println("hello" + c2);

        char c3 = '\t';
        System.out.println(c3 + "world");

        char c4 = '\u0043';
        System.out.println(c4);





        // 方式1，使用临时变量
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m + ", n = " + n);
    }
}
