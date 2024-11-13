package com.base4._super.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月利率
     * @return 月利率
     */
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
     * 取钱
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
