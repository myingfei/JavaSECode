package com.base5._polymorphism.exer4;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Man extends Person {

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("洗手间");
    }

    public void somke() {
        System.out.println("抽烟");
    }
}
