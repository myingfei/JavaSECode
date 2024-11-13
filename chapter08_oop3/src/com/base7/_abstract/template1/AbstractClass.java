package com.base7._abstract.template1;

/**
 * @Author myf15609
 * @Date 2024/8/20
 */
public abstract class AbstractClass {
    // 基本方法
    public abstract void doSomething();

    // 基本方法
    public abstract void doAnything();

    // 模版方法，完成相关逻辑
    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
