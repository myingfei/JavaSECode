package com.base1._this.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("曹", "操");
        bank.addCustomer("刘", "备");

        bank.getCustomer(0).setAccount(new Account(10000));
        bank.getCustomer(0).getAccount().withdraw(500);

        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}
