package com.base5.method_more._01voerload;

/**
 * @Author myf15609
 * @Date 2023/8/9
 */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer o1 = new OverLoadExer();
        System.out.println(o1.mOl(5));
        System.out.println(o1.mOl(5, 9));
        System.out.println(o1.mOl("hello"));

        System.out.println("---------------");
        System.out.println(o1.max(10, 15));
        System.out.println(o1.max(12.3, 8.9));
        System.out.println(o1.max(4.5, 3.6, 6.6));

    }

    public int mOl(int x) {
        return x * x;
    }

    public int mOl(int x, int y) {
        return x * y;
    }

    public String mOl(String x) {
        return x;
    }


    public int max(int i, int j) {
        return (i >= j)? i : j;
    }

    public double max(double i, double j) {
        return (i >= j)? i : j;
    }

    public double max(double i, double j, double k) {
        return (max(i, j) >= k)? max(i, j) : k;
    }
}


