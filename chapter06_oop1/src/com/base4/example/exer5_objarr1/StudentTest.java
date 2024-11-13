package com.base4.example.exer5_objarr1;

/**
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @Author myf15609
 * @Date 2023/4/13
 */
public class StudentTest {
    public static void main(String[] args) {

        // 创建 Student[]
        Student[] students = new Student[20];

        // 使用循环给数组的元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            // [1,20]，学号
            students[i].number = (i + 1);
            // [1,6]，年级
            students[i].state = (int) (Math.random() * 6 + 1);
            // [0,100]，成绩
            students[i].score = (int) (Math.random() * 101);
        }

        // 问题一：打印出3年级(state值为3）的学生信息
        StudentUtil util = new StudentUtil();
        util.printStudentsWithState(students, 3);

        System.out.println();

        // 排序前遍历打印
        util.printStudents(students);

        System.out.println();

        // 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        util.sortStudents(students);

        // 排序后遍历
        util.printStudents(students);
    }
}
