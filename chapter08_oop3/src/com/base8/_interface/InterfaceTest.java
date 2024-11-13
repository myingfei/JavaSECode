package com.base8._interface;

/**
 * @Author myf15609
 * @Date 2023/8/23
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 1. 创建接口实现类的对象
        Flash flash = new Flash();
        computer.transferData(flash);
        System.out.println("--------------------");

        // 2. 创建接口实现类的匿名对象
        computer.transferData(new Printer());
        System.out.println("--------------------");

        // 3. 创建接口匿名实现类的对象
        Usb iphone = new Usb() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        computer.transferData(iphone);
        System.out.println("--------------------");

        // 4. 创建接口匿名实现类的匿名对象
        computer.transferData(new Usb() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            @Override
            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });

    }
}

class Computer {
    public void transferData(Usb usb) {
        usb.start();
        System.out.println("具体数据传输细节");
        usb.stop();
    }
}

interface Usb {
    void start();

    void stop();
}

class Flash implements Usb {
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements Usb {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}