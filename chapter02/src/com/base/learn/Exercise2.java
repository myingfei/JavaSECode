package com.base.learn;

/**
 * 温度转换
 *
 * @Author myf15609
 * @Date 2023/4/2
 */
public class Exercise2 {
    public static void main(String[] args) {
        double hua = 80;
        double she = (hua - 32) / 1.8;
        System.out.println("华氏度" + hua + "℉转为摄氏度是" + she + "℃"); // 华氏度80.0℉转为摄氏度是26.666666666666664℃
    }
}
