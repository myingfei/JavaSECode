package com.base2._singleton;

/**
 * @Author myf15609
 * @Date 2023/8/20
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank1 = Bank.getBank();
        Bank bank2 = Bank.getBank();
        System.out.println(bank1 == bank2);

    }
}

// 饿汉式
class Bank{
    // 1. 私有化构造器
    private Bank() {

    }

    // 2. 在类的内部创建当前类的实例，此属性必须声明为 static 的
    private static Bank bank = new Bank();

    // 3. 使用 getXxx() 方法获取当前类的实例，必须声明为 static 的
    public static Bank getBank() {
        return bank;
    }
}