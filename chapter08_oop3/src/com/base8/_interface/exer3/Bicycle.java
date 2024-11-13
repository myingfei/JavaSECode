package com.base8._interface.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/23
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
