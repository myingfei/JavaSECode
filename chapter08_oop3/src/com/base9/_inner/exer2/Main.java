package com.base9._inner.exer2;

/**
 * @Author myf15609
 * @Date 2024/8/22
 * 成员内部类：静态内部类、非静态内部类
 */
public class Main {
    public static void main(String[] args) {
        // 创建静态内部类的实例
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.print();

        // 创建非静态内部类的实例
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass inner = outerClass.new InnerClass();
        inner.print();
        inner.show("李四");
        System.out.println("----------");
        inner.show1();
    }
}

/*
Inside static inner class：y = 20
Inner Class: x = 10, y = 20
name = 李四
name = 张三
name = Tom
----------
name = 测试
name = 张三
name = Tom
OuterClass的类方法
*/