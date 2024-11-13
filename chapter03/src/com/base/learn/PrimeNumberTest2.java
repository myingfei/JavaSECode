package com.base.learn;

/**
 * @Author myf15609
 * @Date 2024/2/5
 * 100以内的所有质数的输出
 * 质数：只能被1和它本身整除的自然数
 * 优化版本
 */
public class PrimeNumberTest2 {
    public static void main(String[] args) {
        boolean isFlag = true;
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) {
            // j <= Math.sqrt(i)，通过减小范围
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    // 只要能被 2 到 j <= Math.sqrt(i) 当中有一个数整除，这个 i 就不是质数，就没有必要继续下去了
                    break;
                }
            }
            if (isFlag) {
                count++;
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为: " + count);
        System.out.println("运行花费的时间为: " + (end - start));
    }
}
