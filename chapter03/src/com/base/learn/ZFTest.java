package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/3/5
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class ZFTest {
    public static void main(String[] args) {
        // 定义一个计数器，初始值为 0
        int count = 0;

        // 定义珠穆朗玛峰的高度
        int zf = 8848860; //单位：毫米

        double paper = 0.1; //单位：毫米

        while (paper < zf) {
            count++; // 在循环中累加执行，对应折叠次数
            paper *= 2; //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
        }
        System.out.println("需要折叠" + count + "次");
        System.out.println("折纸的高度为" + paper/1000 + "米，超过了珠峰的高度");

    }
}
