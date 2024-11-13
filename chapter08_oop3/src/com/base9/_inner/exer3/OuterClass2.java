package com.base9._inner.exer3;

/**
 * @Author myf15609
 * @Date 2024/8/22
 * 局部内部类，常用于在方法内部创建类，并且只在方法内部使用
 */
public class OuterClass2 {
    private int x = 10;
    static int y = 20;

    public void method() {
        // 局部内部类
        class LocalInnerClass {
            public void print() {
                // 可以访问外部类的所有成员
                System.out.println("Local Inner Class: x = " + x + ", y = " + y);
            }
        }

        // 创建局部内部类的实例
        LocalInnerClass inner = new LocalInnerClass();
        inner.print();
    }
}
