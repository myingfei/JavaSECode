package com.base7._abstract.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/22
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary; // 月工资

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary + "," + super.toString() +
                '}';
    }
}
