package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/6/19
 */
public class ArithmeticExer4 {
    public static void main(String[] args) {
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;
        System.out.println("为抵抗洪水，战士连续作战：" + hours + " 个小时");
        System.out.println("为抵抗洪水，战士连续作战：" + day + " 天 " + hour + " 小时");
    }
}
