package com.base6._object.equals.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/20
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "orderAA");
        Order order2 = new Order(1001, "orderAA");
        System.out.println(order1.equals(order2)); // true

        Order order3 = new Order(1002, new String("orderBB"));
        Order order4 = new Order(1002, new String("orderBB"));

        // 返回true的原因是：return orderId == order.orderId && Objects.equals(orderName, order.orderName);
        // String 重写了 equals 方法，比较的是内容是否相等
        System.out.println(order3.equals(order4)); // true

        // == 如果是引用数据类型，比较的是地址值，但下面这个例子为何是返回true呢，应该有字符串常量池，后面详细理解
        String str1 = "AA";
        String str2 = "AA";

        System.out.println(str1 == str2); // true，为什么是true，后面在字符串常量池讲

    }
}
