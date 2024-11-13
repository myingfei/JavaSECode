package com.base4.search_sort.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/6
 * 二分查找，前提是，所要查找的数组必须有序
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};

        int target = 5;
        boolean isFlag = true;
        int begin = 0;
        int end = arr2.length - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (target == arr2[middle]){
                System.out.println("找到了" + target + "，对应的位置为：" + middle);
                isFlag = false;
                break;
            }else if (target > arr2[middle]){
                begin = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        if (isFlag){
            System.out.println("不好意思，未找到");
        }
    }
}
