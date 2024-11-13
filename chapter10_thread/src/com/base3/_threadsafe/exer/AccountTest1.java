package com.base3._threadsafe.exer;

/**
 * @Author myf15609
 * @Date 2023/9/17
 */
public class AccountTest1 {
    public static void main(String[] args) {
        Account1 account1 = new Account1();

        Customer1 c1 = new Customer1(account1);
        Customer1 c2 = new Customer1(account1);

        Thread t1 = new Thread(c1, "甲");
        Thread t2 = new Thread(c2, "乙");

        t1.start();
        t2.start();

    }
}

class Account1 {
    private double balance; // 余额

    public synchronized void deposit(double amt) { // account 是唯一的
        if (amt > 0) {
            balance += amt;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "-存" + amt + "元，余额为：" + balance);
    }
}

class Customer1 implements Runnable {
    Account1 account1;

    public Customer1() {
    }

    public Customer1(Account1 account1) {
        this.account1 = account1;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account1.deposit(1000);
        }
    }
}