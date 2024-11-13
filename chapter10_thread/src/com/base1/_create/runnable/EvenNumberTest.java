package com.base1._create.runnable;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */

// ① 创建一个实现 Runnable 接口的类
class EvenNumberPrint implements Runnable {
    // ② 实现接口中的run() --> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class EvenNumberTest {
    public static void main(String[] args) {
        // ③ 创建当前实现类的对象
        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();

        // ④ 将此对象作为参数传递到 Thread 类的构造器中，创建Thread类的实例
        Thread t1 = new Thread(evenNumberPrint);

        // ⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
        t1.start();
    }
}
