package com.base3.common_algorithm.exer5;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        String[] arr = new String[]{"SS", "QQ", "YY", "XX", "TT", "KK", "EE", "GG", "KK"};

        // 数组的反转，方法 1
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}
