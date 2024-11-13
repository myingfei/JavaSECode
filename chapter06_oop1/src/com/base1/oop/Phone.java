package com.base1.oop;

/**
 * @Author myf15609
 * @Date 2023/8/6
 */
public class Phone {
    // 属性
    String name;
    double price;

    // 方法
    public void call() {
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送信息：" + message);
    }

    public void playGame() {
        System.out.println("手机可以玩游戏");
    }
}
