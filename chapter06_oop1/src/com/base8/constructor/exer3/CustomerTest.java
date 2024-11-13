package com.base8.constructor.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/17
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        customer.setAccount(new Account(1001, 2000, 0.0123));

        // 针对客户的账户进行取钱、存钱操作
        customer.getAccount().deposit(2000);
        customer.getAccount().withdraw(300);
        customer.getAccount().withdraw(200);

        System.out.println(customer);
    }
}
