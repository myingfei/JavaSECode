package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 三个数大小比较
 */
public class IfElesTest4 {
    public static void main(String[] args) {
        // 声明num1、num2、num3 三个变量并赋值
        int num1 = 22, num2 = 32, num3 = 12;

        if (num1 >= num2){
            if (num3 >= num1)
                System.out.println(num2 + "-" + num1 + "-" + num3);
            else if (num3 <= num2)
                System.out.println(num3 + "-" + num2 + "-" + num1);
            else
                System.out.println(num2 + "-" + num3 + "-" + num3);
        }else { // num1 < num2
            if (num3 >= num2)
                System.out.println(num1 + "-" + num2 + "-" + num3);
            else if (num3 <= num1)
                System.out.println(num3 + "-" + num1 + "-" + num2);
            else
                System.out.println(num1 + "-" + num3 + "-" + num2);
        }
    }
}
