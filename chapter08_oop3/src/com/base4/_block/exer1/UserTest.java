package com.base4._block.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1);

        User user2 = new User("zhangsan", "888888");
        System.out.println(user2);

        System.out.println("----------");

        User1 user11 = new User1("lisi", "999999");
        System.out.println(user11);
    }
}
