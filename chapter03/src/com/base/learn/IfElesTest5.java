package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 */
public class IfElesTest5 {
    public static void main(String[] args) {
        boolean b = true;
        //如果写成if(b=false)能编译通过吗？如果能，结果是？
        if(b == false) 	 //建议：if(!b)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");

    }
}
