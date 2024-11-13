package com.base3._threadsafe.runnablesafe;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */


class SaleTicket1 implements Runnable {
    int ticket = 100;
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            show();
        }
    }

    // 此时的同步监视器默认是 this、是唯一的
    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s = new SaleTicket1();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
