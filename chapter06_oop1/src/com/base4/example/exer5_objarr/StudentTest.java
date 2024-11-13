package com.base4.example.exer5_objarr;

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

        // 创建20个学生对象 Student[]
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

        // 问题一：打印出3年级(state值为3）的学生信息。
        for (Student student : students) {
            if (student.state == 3) {
                student.info();
            }
        }
        System.out.println();

        // 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        // 排序前
        for (Student student : students) {
            student.info();
        }
        System.out.println();

        // 排序
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    // 这里需要注意，根据成绩，交换的是学生对象，这里容易出错
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // 排序后
        for (Student student : students) {
            student.info();
        }
    }
}
