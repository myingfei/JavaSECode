package com.base3.common_algorithm.exer4;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class ArrayExer04_2 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        // 数组的复制
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        array2[0] = 33;
        for (int i : array1) System.out.print(i + " "); // 2 3 5 7 11 13 17 19
        System.out.println();
        for (int i : array2) System.out.print(i + " "); // 33 3 5 7 11 13 17 19
    }
}
