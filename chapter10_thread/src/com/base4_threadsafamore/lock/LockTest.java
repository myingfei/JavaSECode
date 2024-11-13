package com.base4_threadsafamore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author myf15609
 * @Date 2023/9/17
 */

class window extends Thread {
    static int ticket = 100;
    // 1. 创建Lock的实例，需要确保多个线程共用同一个Lock实例!需要考虑将此对象声明为static final
    private static final ReentrantLock LOCK = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                // 2. 执行lock()方法，锁定对共享资源的调用
                LOCK.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                // 3. unlock()的调用，释放对共享数据的锁定
                LOCK.unlock();
            }
        }

    }
}


public class LockTest {
    public static void main(String[] args) {
        window w1 = new window();
        window w2 = new window();
        window w3 = new window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}


