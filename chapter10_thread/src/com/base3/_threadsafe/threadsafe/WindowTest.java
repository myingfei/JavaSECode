package com.base3._threadsafe.threadsafe;

/**
 * @Author myf15609
 * @Date 2023/9/16
 */

class Window extends Thread {
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Window.class) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
