package com.base9._inner.exer2;

/**
 * @Author myf15609
 * @Date 2024/8/22
 */
public class OuterClass {
    private int x = 10;
    static int y = 20;
    String name = "Tom";


    public void print() {
        System.out.println("OuterClass的类方法");
    }

    // 静态内部类
    static class StaticInnerClass {
        public void print() {
            // 不能访问外部类的非静态成员
            System.out.println("Inside static inner class：y = " + y);
        }
    }

    // 非静态内部类
    class InnerClass {
        String name = "张三";

        public void print() {
            System.out.println("Inner Class: x = " + x + ", y = " + y);
        }

        public void show(String name) {
            System.out.println("name = " + name);
            System.out.println("name = " + this.name);
            System.out.println("name = " + OuterClass.this.name);
        }

        public void show1() {
            // 调用内部类的方法
            this.show("测试");
            // 调用外部类的方法
            OuterClass.this.print();
        }
    }
}
