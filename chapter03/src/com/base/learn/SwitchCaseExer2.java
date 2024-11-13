package com.base.learn;


/**
 * @Author myf15609
 * @Date 2024/3/5
 */
public class SwitchCaseExer2 {
    public static void main(String[] args) {

        char word = 'c';
        switch (word) {
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            default:
                System.out.println("orther");
        }
    }
}
