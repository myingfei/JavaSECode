package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/6/20
 */
public class ConditionExer3 {
    public static void main(String[] args) {
        int week = 2;
        week += 10;
        week %= 7;
        System.out.println("今天是周2, 10天以后是周" + (week == 0 ? "日" : week));
    }
}
