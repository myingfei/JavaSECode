package com.base1.oop;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 创建 Phone 的对象
        Phone p1 = new Phone();

        // 通过 Phone 的对象，调用其内部的属性或方法
        // 格式：对象.属性 或 对象.方法

        p1.name = "HuaWei Mate50";
        p1.price = 4999;
        System.out.println("name = " + p1.name + ", price =" + p1.price);

        // 调用方法
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
