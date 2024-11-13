package com.base4.search_sort.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/6
 * 换一种写法，基本一样
 */
public class LinearSearchTest_02 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        int target = 5;
        int i = 0;
        for (; i < arr2.length; i++) {
            if (target == arr2[i]) {
                System.out.println("找到了" + target + "，对应的位置为：" + i);
                break;
            }
        }
        if (i == arr2.length) {
            System.out.println("不好意思，没有找到此元素");
        }
    }
}
