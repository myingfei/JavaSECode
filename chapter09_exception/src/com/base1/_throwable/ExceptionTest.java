package com.base1._throwable;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @Author myf15609
 * @Date 2023/9/3
 */
public class ExceptionTest {

    // ArrayIndexOutOfBoundsException
    @Test
    public void test_01() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    // NullPointerException
    @Test
    public void test_02() {
        String str = "hello";
        str = null;
        System.out.println(str);

        int[][] arr = new int[10][];
        System.out.println(arr[0][0]);
    }

    // ClassCastException
    // 父类引用指向的对象是子类的时候才可以进行强制类型转换
    @Test
    public void test_03() {
        Object obj = new String();
        String str = (String) obj; // ok

        Date date = (Date) obj; // 异常
    }

    // NumberFormatException
    @Test
    public void test_04() {
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
    }

    // InputMismatchException
    @Test
    public void test_05() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    // ArithmeticException
    @Test
    public void test_06() {
        int num = 10;
        System.out.println(num / 0);
    }
}
