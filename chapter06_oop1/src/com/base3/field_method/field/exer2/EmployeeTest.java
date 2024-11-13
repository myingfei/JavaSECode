package com.base3.field_method.field.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/8
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1001;
        emp1.name = "张三";
        emp1.age = 18;
        emp1.salary = 10000;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 2023;
        emp1.birthday.month = 12;
        emp1.birthday.day = 20;

        System.out.println("id = " + emp1.id + ",name = " + emp1.name + ",age = " + emp1.age + ",salary = " +
                emp1.salary + ", birthday = [" + emp1.birthday.year + "年" +
                emp1.birthday.month + "月" + emp1.birthday.day + "日]");

    }
}
