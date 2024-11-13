package com.base1._static.exer2;

import java.util.Arrays;

/**
 * @Author myf15609
 * @Date 2023/4/12
 */
public class MyArraysTest {
    public static void main(String[] args) {

        // 1.动态初始化创建数组
        int[] arr = new int[20];

        // 2.通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10; // [10 - 99]
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        System.out.println("最大值为：" + MyArrays.getMax(arr));
        System.out.println("最小值为：" + MyArrays.getMin(arr));
        System.out.println("和：" + MyArrays.getSum(arr));
        System.out.println("平均值为：" + MyArrays.getAvg(arr));
        // 遍历
        MyArrays.print(arr);
        System.out.println("新数组：" + Arrays.toString(MyArrays.copy(arr)));

        // 反转
        MyArrays.reverse(arr);
        // 反转后遍历数组
        System.out.print("反转后遍历数组：");
        MyArrays.print(arr);

        // 降序
        MyArrays.sort(arr, "desc");
        System.out.print("降序后遍历：");
        MyArrays.print(arr);


        // 升序
        MyArrays.sort(arr, "asc");
        System.out.print("升序后遍历：");
        MyArrays.print(arr);

        System.out.println("查找：" + MyArrays.linearSearch(arr, 12));
    }
}
