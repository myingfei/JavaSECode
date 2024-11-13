package com.base10._enum;

/**
 * @Author myf15609
 * @Date 2024/8/25
 */
public class enumTest {
    public static void main(String[] args) {
        // 使用 Day 枚举类
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today.name()); // 输出：Today is: MONDAY

        // 使用 ordinal() 方法
        System.out.println("Ordinal of " + today + " is: " + today.ordinal()); // 输出：Ordinal of MONDAY is: 1

        // 使用 values() 方法遍历枚举
        for (Day day : Day.values()) {
            System.out.println(day);
        }

        // 使用 valueOf() 方法
        Day anotherDay = Day.valueOf("FRIDAY");
        System.out.println("Another day: " + anotherDay); // 输出：Another day: FRIDAY

        // 使用 compareTo() 方法
        Day day1 = Day.SUNDAY;
        Day day2 = Day.WEDNESDAY;
        System.out.println(day1.compareTo(day2)); // 输出：-3 （SUNDAY 在 WEDNESDAY 之前）

        // 使用 toString() 方法（默认情况下）
        System.out.println(today.toString()); // 输出：MONDAY
    }
}


enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

