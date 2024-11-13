package com.base6.exception;

/**
 * @Author myf15609
 * @Date 2023/8/6
 * 数组中常见异常：
 * 1. ArrayIndexOutOfBoundsException 数组角标越界异常
 * 2. NullPointerException 空指针异常
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // System.out.println(arr[9]); 触发 ArrayIndexOutOfBoundsException 异常

        // NullPointerException 空指针异常
        int[] arr1 = new int[]{1, 2, 3};
        // 情况 1
        // arr1 = null;
        // System.out.println(arr1[0]);

        // 情况 2
        // int[][] arr2 = new int[5][];
        // System.out.println(arr2[0][0]);

        // 情况 3
        // String[] arr3 = new String[]{"aa", "bb", "cc"};
        // arr3[0] = null;
        // System.out.println(arr3[0].toString());

    }
}
