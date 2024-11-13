package com.base2._traycatchfinally.interview;

/**
 * @Author myf15609
 * @Date 2024/8/24
 */
public class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    public static int test(int num) {
        try {
            return num;
        } catch (NumberFormatException e) {
            return num--;
        } finally {
            System.out.println("test结束");
//            return ++num;
            ++num;
        }
    }
}
/*
test结束
10
*/