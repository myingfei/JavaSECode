package com.base4.example.exer5_objarr1;

/**
 * @Author myf15609
 * @Date 2023/4/13
 */
public class StudentUtil {

    /**
     * 打印出指定年级的学生信息
     *
     * @param students 学生数组
     * @param state    年级
     */
    public void printStudentsWithState(Student[] students, int state) {
        for (Student student : students) {
            if (student.state == state) {
                student.info();
            }
        }
    }

    /**
     * 遍历
     *
     * @param students 学生数组
     */
    public void printStudents(Student[] students) {
        for (Student student : students) {
            student.info();
        }
    }

    /**
     * 使用冒泡排序按学生成绩排序
     *
     * @param students 学生数组
     */
    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
