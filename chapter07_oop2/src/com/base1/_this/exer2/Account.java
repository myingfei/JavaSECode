package com.base1._this.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * 提款
     * @param amt 金额
     */
    public void withdraw(double amt) {
        if (balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("取钱成功：" + amt);
        }else {
            System.out.println("取款金额有误或余额不足");
        }
    }

    /**
     * 存款
     * @param amt 金额
     */
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("存款成功：" + amt);
        }
    }
}
