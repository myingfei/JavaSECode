package com.base3.common_algorithm.exer1;

/**
 * @Author myf15609
 * @Date 2023/4/6
 * [10 - 99]最大值，最小值，总和，平均值
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        // 1.动态初始化创建数组
        int[] arr = new int[10];

        // 2.通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 3. 最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        // 4. 最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);

        // 5. 总和
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("总和为：" + sum);

        // 6. 平均值
        int avgValue = sum / arr.length;
        System.out.println("平均值为：" + avgValue);
    }
}
