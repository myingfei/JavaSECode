package com.base3.common_algorithm.exer2;

/**
 * @Author myf15609
 * @Date 2023/4/7
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 9, 0, 3, 7, 10, 8, 9};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
            if (min > score) {
                min = score;
            }
            sum += score;
        }
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("平均值：" + avg);
    }
}
