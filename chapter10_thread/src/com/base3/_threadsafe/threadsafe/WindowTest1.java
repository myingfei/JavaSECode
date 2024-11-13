package com.base3._threadsafe.threadsafe;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */


class Windows1 extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

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

    // private synchronized void show() 此时同步监视器为 this，this：w1、w2、w3，不唯一，这种写法不对
    // private static synchronized void show() 此时当前同步监视器为当前类本身 Windows1.class
    private void show() {
        // 使用类锁确保同步
        synchronized (Windows1.class) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "-售票，票号为：" + ticket);
                ticket--;
            } else {
                isFlag = false;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Windows1 w1 = new Windows1();
        Windows1 w2 = new Windows1();
        Windows1 w3 = new Windows1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
