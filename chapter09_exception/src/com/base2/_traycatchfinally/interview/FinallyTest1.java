package com.base2._traycatchfinally.interview;

/**
 * @Author myf15609
 * @Date 2024/8/24
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        int result = test("123");
        System.out.println(result);

    }

    public static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test结束");
        }
    }
}

/*
test结束
1
*/