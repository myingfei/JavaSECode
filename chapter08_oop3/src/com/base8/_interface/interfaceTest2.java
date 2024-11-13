package com.base8._interface;

/**
 * @Author myf15609
 * @Date 2024/8/25
 */
public class interfaceTest2 {
    public static void main(String[] args) {
        // 通过接口名调用接口的静态方法、静态常量
        System.out.println(USB3.MAX_SPEED);
        USB3.show();
        System.out.println("---------");

        // 创建实现类对象
        MobileHDD mobileHDD = new MobileHDD();

        // 通过实现类对象调用重写的抽象方法，以及接口的默认方法，如果实现类重写了就执行重写的默认方法，如果没有重写，就执行接口中的默认方法
        mobileHDD.start();
        mobileHDD.in();
        mobileHDD.stop();

    }
}

class MobileHDD implements USB3 {
    @Override
    public void in() {
        System.out.println("in");
    }

    @Override
    public void out() {
        System.out.println("out");
    }
}

interface USB3 {
    //静态常量
    long MAX_SPEED = 500 * 1024 * 1024; // 500MB/s

    //抽象方法
    void in();

    void out();

    //默认方法
    default void start() {
        System.out.println("开始");
    }

    default void stop() {
        System.out.println("结束");
    }

    //静态方法
    static void show() {
        System.out.println("USB 3.0可以同步全速地进行读写操作");
    }
}

