package com.base2.two.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class ArrayExer04 {
    public static void main(String[] args) {
        // 初始化数组：静态初始化
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        // 记录元素的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);
    }
}
