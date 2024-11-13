package com.base1._create.runnable;

import org.junit.Test;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */
public class EvenNumberTest01 {
    @Test
    public void test01() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}
