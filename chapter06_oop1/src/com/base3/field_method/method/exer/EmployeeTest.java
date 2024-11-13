package com.base3.field_method.method.exer;

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

        emp1.show1();

        Employee emp2 = new Employee();
        emp2.id = 1002;
        emp2.name = "李四";
        emp2.age = 22;
        emp2.salary = 20000;

        System.out.println(emp2.show2());
    }
}
