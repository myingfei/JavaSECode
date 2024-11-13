package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/3/5
 * 循环嵌套的例子
 */
public class ForForTest {
    public static void main(String[] args) {
        /*
         *********
         *********
         *********
         *********
         *********
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
