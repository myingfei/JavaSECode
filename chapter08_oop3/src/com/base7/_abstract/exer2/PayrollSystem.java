package com.base7._abstract.exer2;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/8/22
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2]; // 对象数组存储的是地址值，并未实例化
        employees[0] = new SalariedEmployee("张三", 1001, new MyDate(1992, 11, 11), 28000);
        employees[1] = new HourlyEmployee("李四", 1001, new MyDate(1992, 11, 11), 230, 100);

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入当前的月份：");
        int month = scan.nextInt();

        for (Employee e : employees) {
            System.out.println(e.toString());
            System.out.println("工资为：" + e.earnings());

            if (month == e.getBirthday().getMonth()) {
                System.out.println("生日快乐，加薪100");
            }
        }
        scan.close();
    }
}
