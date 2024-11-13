package com.base12._wrapper.interview;

import org.junit.Test;

/**
 * @Author myf15609
 * @Date 2024/8/24
 */
public class interviewTest {
    @Test
    public void test01() {
        // Integer 内部定义了 IntegerCache 结构，IntegerCache 中定义了 static final Integer cache[];
        // 保存了从 -128 ~ 127 范围的整数。如果我们使用自动装箱的方式给 Integer 赋值的范围在 -128 ～ 127 范围内时
        // 可以直接使用数组中的元素，不同再去 new 了，目的：提高效率

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false、引用类型，== 比较地址值，不是一个对象，所以 false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // true、自动装箱，这里涉及到的包装类的缓存机制，下面可以通过源码查看

        Integer x = 128; // 出了 cache[] 范围，相当于 new 了一个 Integer 对象
        Integer y = 128;
        System.out.println(x == y); // false
    }
    @Test
    public void test02() {
        // 题目1
        int i = 10;
        double d = 10.2;
        System.out.println(i == d); // false

        // 题目2
        Integer i1 = 10;
        Double d1 = 10.2;
        // System.out.println(i1 == d1); // 编译报错

        //题目3：
        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n); // true

        //题目4：
        Integer x = 1000;
        int y = 1000;
        System.out.println(x == y); // true
    }
}
