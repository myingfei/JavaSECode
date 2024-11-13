package com.base5._communication;

/**
 * Description:
 * 案例2：生产者&消费者
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 * <p>
 * 分析：
 * 1. 是否是多线程问题？ 是，生产者、消费者
 * 2. 是否有共享数据？有！ 共享数据是：产品
 * 3. 是否有线程安全问题？ 有！因为有共享数据
 * 4. 是否需要处理线程安全问题？是！ 如何处理？使用同步机制
 * 5. 是否存在线程间的通信？ 存在。
 *
 * @Author myf15609
 * @Date 2023/9/17
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer("生产者", clerk);
        Consumer c1 = new Consumer("消费者1", clerk);
        Consumer c2 = new Consumer("消费者2", clerk);

        p1.start();
        c1.start();
        c2.start();

    }
}


class Clerk {
    private int productNum = 0;//产品的数量

    public synchronized void addProduct() {
        // 如果生产商品 >= 20 则 wait()
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "产品");
            notifyAll();
        }
    }


    public synchronized void minusProduct() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "产品");
            productNum--;
            notifyAll();
        }
    }
}

/**
 * 生产者
 */
class Producer extends Thread {

    Clerk clerk;

    public Producer(String name, Clerk clerk) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("生产者开始生产商品...");
            clerk.addProduct();
        }
    }
}

/**
 * 消费者
 */
class Consumer extends Thread {
    Clerk clerk;

    public Consumer(String name, Clerk clerk) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("消费者开始消费产品...");
            clerk.minusProduct();
        }
    }
}