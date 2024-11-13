package com.base4.search_sort.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        // 扩容一倍容量
        // int[] newArr = new int[arr.length * 2];

        // 新的写法
        // 6 --> 0000 0110 --> 0000 1100 --> 12
        int[] newArr = new int[arr.length << 1];
        // 将原有数组中的元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 将 10、20、30 三个数据添加到新数组中
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        // 将新的数组的地址赋值给原有的数组变量
        arr = newArr;
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
