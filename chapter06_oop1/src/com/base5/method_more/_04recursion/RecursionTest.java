package com.base5.method_more._04recursion;

/**
 * 递归方法的使用(了解)
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 * @Author myf15609
 * @Date 2023/8/10
 */
public class RecursionTest {
    public static void main(String[] args) {
        // 例1：计算 0-100 之前所有自然数的和
        // 方法1：for 循环
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);

        // 方法2：递归调用
        RecursionTest r = new RecursionTest();
        System.out.println("sum2: " + r.getSum(100));
    }

    public int getSum(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n + getSum(n - 1);
        }
    }
}
