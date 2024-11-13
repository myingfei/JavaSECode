package com.base7._abstract.template;

/**
 * @Author myf15609
 * @Date 2023/8/22
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        BankTemplateMethod btm1 = new DrawMoney();
        btm1.process();

        System.out.println("-------------");

        BankTemplateMethod btm2 = new ManagMoney();
        btm2.process();
    }
}
