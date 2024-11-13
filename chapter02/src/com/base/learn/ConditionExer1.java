package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/3/5
 */
public class ConditionExer1 {
    public static void main(String[] args) {
        // 获取两个数的较大值
        int m1 = 10;
        int m2 = 20;
        int max1 = (m1 > m2) ? m1 : m2;
        System.out.println("m1 和 m2 中较大值为：" + max1);

        // 三元运算符可以嵌套
        String str = (m1 > m2) ? "m1 大" : ((m1 == m2) ? "m1 和 m2 相等" : "m2 大");
        System.out.println(str);
    }
}
