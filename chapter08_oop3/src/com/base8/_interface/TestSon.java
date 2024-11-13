package com.base8._interface;

/**
 * @Author myf15609
 * @Date 2024/8/25
 */
public class TestSon {
    public static void main(String[] args) {
        Son s = new Son();
        s.date(); // 吃饭
    }
}


interface Friend {
    default void date() {//约会
        System.out.println("朋友吃喝玩乐");
    }
}

class Father {
    public void date() {
        System.out.println("吃饭");
    }
}

class Son extends Father implements Friend {
    @Override
    public void date() {
        // 不重写默认保留父类的
        // 调用父类
        super.date();
        // 调用父接口的
        Friend.super.date();
        // 完全重写
        System.out.println("更康师傅学习Java");
    }
}