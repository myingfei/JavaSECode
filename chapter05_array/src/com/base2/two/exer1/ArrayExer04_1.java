package com.base2.two.exer1;

/**
 * @Author myf15609
 * @Date 2023/11/4
 */
public class ArrayExer04_1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int[] ints : arr) {
            for (int j : ints) {
                sum += j;
            }
        }
        System.out.println("总和为：" + sum);
    }
}
