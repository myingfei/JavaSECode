package com.base4.search_sort.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class LinearSearchTest_01 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        int target = 5;
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + "，对应的位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("不好意思，没有找到此元素");
        }
    }
}
