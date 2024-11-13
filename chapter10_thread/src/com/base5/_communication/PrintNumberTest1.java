package com.base5._communication;

/**
 * 案例：使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author myf15609
 * @Date 2023/9/17
 */
public class PrintNumberTest1 {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread t1 = new Thread(printNumber, "线程1");
        Thread t2 = new Thread(printNumber, "线程2");

        t1.start();
        t2.start();

    }
}

class PrintNumber implements Runnable {
    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        // 线程一旦执行此方法，就进入等待状态。同时，会释放对同步监视器的调用
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }else {
                    break;
                }
            }
        }
    }
}
