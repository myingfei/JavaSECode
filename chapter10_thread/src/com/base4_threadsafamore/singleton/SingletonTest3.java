package com.base4_threadsafamore.singleton;

/**
 * @Author myf15609
 * @Date 2023/9/17
 */
public class SingletonTest3 {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1和singleton2是同一个实例。");
        } else {
            System.out.println("singleton1和singleton2不是同一个实例。");
        }

    }
}


class Singleton {
    private static volatile Singleton instance; // 使用volatile关键字确保可见性

    private Singleton() {
        // 私有构造函数，防止外部创建实例
    }

    public static Singleton getInstance() {
        if (instance == null) { // 第一次检查
            synchronized (Singleton.class) {
                if (instance == null) { // 第二次检查
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
