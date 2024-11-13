package com.base6._object.equals.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/20
 */
public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);

        // 引用数据类型，== 判断的是地址值，所以打印：m1!=m2
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }

        // 重写 equals 方法，引用数据类型，判断的是内容是否相等，true，所以打印：m1 is equal to m2
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
