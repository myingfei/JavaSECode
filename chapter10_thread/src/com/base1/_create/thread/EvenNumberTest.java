package com.base1._create.thread;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */

// ① 创建一个继承于 Thread 类的子类
class PrintNumber extends Thread {
    // ② 重写 Thread 类的run() ---> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}


public class EvenNumberTest {
    public static void main(String[] args) {
        // ③ 创建当前 Thread 的子类的对象
        PrintNumber printNumber = new PrintNumber();

        // ④ 通过对象调用start()
        printNumber.start();
    }
}
