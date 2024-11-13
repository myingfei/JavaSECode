package com.base5._field.interview;

/**
 * 阅读代码，分析运行结果
 *
 * @author 尚硅谷-宋红康
 * @create 16:02
 */
public class Test02 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void method() {
        // 前++ 先自加1，再运算
        // 后++ 先运算，再自加1
        // 运算：y = -1 + 1
        y = z++ + ++z;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x); // -1
        z--; // -1
        method();
        System.out.println("result:" + (z + y + ++z)); // 1 + 0 + 2 = 3
    }
}
