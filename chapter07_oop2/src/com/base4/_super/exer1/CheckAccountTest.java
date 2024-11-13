package com.base4._super.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122, 20000, 0.045, 5000);
        account.withdraw(5000);
        System.out.println("账户余额为：" + account.getBalance() + ",可透支额度为：" + account.getOverdraft());

        account.withdraw(18000);
        System.out.println("账户余额为：" + account.getBalance() + ",可透支额度为：" + account.getOverdraft());

        account.withdraw(3000);
        System.out.println("账户余额为：" + account.getBalance() + ",可透支额度为：" + account.getOverdraft());
    }
}