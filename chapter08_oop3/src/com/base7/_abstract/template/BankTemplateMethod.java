package com.base7._abstract.template;

/**
 * @Author myf15609
 * @Date 2023/8/22
 */
public abstract class BankTemplateMethod {
    // 具体方法
    public void talkNumber() {
        System.out.println("排队取号");
    }

    public abstract void transact();


    public void evaluate() {
        System.out.println("反馈评分");
    }

    // 模版方法
    public final void process() {
        this.talkNumber();
        this.transact();
        this.evaluate();
    }
}
