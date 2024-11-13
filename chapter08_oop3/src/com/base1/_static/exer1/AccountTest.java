package com.base1._static.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/20
 */
public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account();
        System.out.println(account1); // Account{id=1001, password='000000', balance=0.0}

        Account account2 = new Account("123456", 20000);
        System.out.println(account2); // Account{id=1002, password='123456', balance=20000.0}

        Account.setInterestRate(0.0123);
        Account.setMinBalance(100.0);

        System.out.println("银行存款的利率：" + Account.getInterestRate());
        System.out.println("银行的最小存款额度为：" + Account.getMinBalance());
    }
}
