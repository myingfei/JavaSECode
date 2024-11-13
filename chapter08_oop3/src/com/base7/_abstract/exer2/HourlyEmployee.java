package com.base7._abstract.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/22
 */
public class HourlyEmployee extends Employee{
    private double wage; // 单位小时的工资
    private int hour; // 月工作小时数

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
