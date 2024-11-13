package com.base1._static.interview;

/**
 * 判断如下程序运行时是否会报错？
 *
 */
public class StaticTest {
    public static void main(String[] args) {
        Order order = null;
        // 静态方法属于类本身，而不是类的实例，因此即使 order 变量为 null，依然可以通过 order.hello() 调用静态方法，因为 Java 编译器将 order.hello() 解析为 Order.hello()
        order.hello(); // hello

        // 同理，静态变量属于类本身，order.count 实际上被编译器解析为 Order.count
        System.out.println(order.count); // 1
    }
}

class Order {
    public static int count = 1;

    public static void hello() {
        System.out.println("hello!");
    }
}