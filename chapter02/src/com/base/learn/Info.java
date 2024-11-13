package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/2
 */
public class Info {
    public static void main(String[] args) {
        String s1 = "Hello Bike";
        System.out.println(s1); // Hello Bike

        int number = 1001;
        String numberStr = "学号";
        String info = numberStr + number;
        System.out.println(info);
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1); // 学号1001true
        // String info2 = number + b1 + numberStr; // 编译不通过，因为 int 类型不能和 boolean 计算
    }
}
