package com.base5.arrays;

import java.util.Arrays;

/**
 * @Author myf15609
 * @Date 2023/8/6
 * Arrays 工具类的使用
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{9, 5, 3, 7};

        // 判断两个数组是否相等
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals); // false

        // 输出数组信息
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4]

        // 将指定的数值填充到数组中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1)); // [10, 10, 10, 10]

        // 对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [3, 5, 7, 9]

        // 对排序后的 arr2 进行二分检索指定的值
        int index = Arrays.binarySearch(arr2, 5);
        if (index >= 0) {
            System.out.println(index); // 1
        }else {
            System.out.println("未找到");
        }

    }
}
