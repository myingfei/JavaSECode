package com.base1._static.exer2;

/**
 * 根据上一章数组中的常用算法操作，自定义一个操作 int[] 的工具类
 * 涉及到的方法有：求最大值，最小值，总和，平均数，遍历数组，复制数组，数组反转，数组排序（默认从小到大），查找等
 *
 * @Author myf15609
 * @Date 2023/4/12
 */
public class MyArrays {

    /**
     * 获取 int[] 数组的最大值
     *
     * @param arr 数组
     * @return 数组的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取 int[] 数组的最小值
     *
     * @param arr 数组
     * @return 数组的最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 获取 int[] 数组的和
     *
     * @param arr 数组
     * @return 数组的和
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * 获取 int[] 数组的平均值
     *
     * @param arr 数组
     * @return 平均值
     */
    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 遍历数组,以这种形式打印数组元素 [12,13,14]
     *
     * @param arr 数组
     */
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * 数组的 copy
     *
     * @param arr 数组
     * @return 新数组
     */
    public static int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 数组的反转
     *
     * @param arr 数组
     */
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    public static void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }


    /**
     * 数组升序 / 降序
     *
     * @param arr        待排数组
     * @param sortMethod asc:升序   desc：降序
     */
    public static void sort(int[] arr, String sortMethod) {
        if ("asc".equals(sortMethod)) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                }
            }
        } else if ("desc".equals(sortMethod)) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if (arr[i] < arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                }
            }
        } else {
            System.out.println("输入有误");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    /**
     * 使用线性查找的方式，查找指定的元素
     *
     * @param arr    待查找的数组
     * @param target 要查找的元素
     * @return target 元素在 arr 数组中是索引位置，如果没有找到返回-1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
