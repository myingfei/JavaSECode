package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/3/5
 */
public class ConditionExer2 {
    public static void main(String[] args) {
        // 获取三个数值的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println(max2);
    }

}
