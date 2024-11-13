package com.base4._super.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class CheckAccount extends Account{
    private double overdraft; // 可透支金额

    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 重写 withdraw 方法，针对与可透支的账户的取钱的操作
     * @param amt 要取的钱数
     */
    @Override
    public void withdraw(double amt) {
        if (getBalance() >= amt) {
            super.withdraw(amt);
        }else if(getBalance() + overdraft >= amt) {
            // 计算剩余额度
            overdraft -= amt - getBalance();
            // 把余额全部取出
            super.withdraw(getBalance());
        }else {
            System.out.println("超出可透支额度：" + overdraft);
        }
    }
}
