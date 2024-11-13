package com.base4_threadsafamore.singleton;

/**
 * @Author myf15609
 * @Date 2023/9/17
 */
public class SingletonTest2 {

    static Order o1 = null;
    static Order o2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                o1 = Order.getInstance();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                o2 = Order.getInstance();
            }
        };
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }
}

class Order {
    //1. 私有化类的构造器
    private Order() {

    }

    // 2. 声明当前类对象，没有初始化
    // 4. 此对象也必须声明为 static 的
    private static volatile Order instance = null;

    // 3. 声明 public static 的返回当前类对象的方法

    // 实现线程安全的方式1
//    public static synchronized Order getInstance() {
//        if (instance == null) {
//            instance = new Order();
//        }
//        return instance;
//    }


    // 实现线程安全的方式2
//    public static Order getInstance() {
//        synchronized (Order.class) {
//            if (instance == null) {
//                instance = new Order();
//            }
//        }
//        return instance;
//    }

    // 实现线程安全的方式3:相较于方式1和方式2来讲，效率更高。为了避免出现指令重排，需要将instance声明为volatile
    public static Order getInstance() {
        if (instance == null) {
            synchronized (Order.class) {
                if (instance == null) {
                    instance = new Order();
                }
            }
        }
        return instance;
    }
}
