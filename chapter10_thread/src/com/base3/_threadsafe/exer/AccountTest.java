package com.base3._threadsafe.exer;

/**
 * @Author myf15609
 * @Date 2023/9/17
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        Customer customer1 = new Customer("甲" ,account);
        Customer customer2 = new Customer("已" ,account);

        customer1.start();
        customer2.start();

    }
}


class Account {
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

class Customer extends Thread {
    Account account;

    public Customer() {
    }

    public Customer(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}