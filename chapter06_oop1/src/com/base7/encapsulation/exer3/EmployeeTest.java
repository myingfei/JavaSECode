package com.base7.encapsulation.exer3;

import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/8/16
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee[] emps = new Employee[2];
        for (int i = 0; i < emps.length; i++) {
            emps[i] = new Employee();

            System.out.println("----------添加第" + (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = scan.next();

            System.out.print("性别：");
            char gender = scan.next().charAt(0);

            System.out.print("年龄：");
            int age = scan.nextInt();

            System.out.print("电话：");
            String phoneNumber = scan.next();

            // 给指定的 Employee 对象的各个属性赋值
            emps[i].setName(name);
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setPhoneNumber(phoneNumber);
        }
        // 遍历员工列表
        System.out.println("---------------员工列表------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (Employee e : emps) {
            System.out.println(e.getInfo());
        }
        System.out.println("---------------员工列表完成------------------");
    }
}
