package com.base4.search_sort.exer1;

/**
 * @Author myf15609
 * @Date 2023/4/7
 * <br>
 * 现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int delIndex = 4;

        for (int i = delIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        for (int a : arr) {
            System.out.print(a + "\t");
        }
    }
}
