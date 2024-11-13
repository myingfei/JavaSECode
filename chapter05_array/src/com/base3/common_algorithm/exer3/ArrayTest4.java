package com.base3.common_algorithm.exer3;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 杨辉三角
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        // 1. 新建二维数组，动态初始化
        int[][] yangHui = new int[10][];

        // 2. 为二维数组赋值操作
        for (int i = 0; i < yangHui.length; i++) {
            // 2.1 第一行有 1 个元素，总共 10 行
            yangHui[i] = new int[i + 1];

            // 2.1 为首末行元素赋值 1
            yangHui[i][0] = yangHui[i][i] = 1;

            // 2.2 给每行的非首末行元素赋值操作
            // j 从每行的第二个元素开始，到倒数第2个元素结束
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        // 3. 打印输出二维数组
        for (int[] ints : yangHui) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
