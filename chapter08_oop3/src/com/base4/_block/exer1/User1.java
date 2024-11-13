package com.base4._block.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public class User1 {
    private String userName;
    private String passWord;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis(); // 获取系统当前时间 （距离1970-1-1 00:00:00的毫秒数）
    }

    public User1() {
        userName = System.currentTimeMillis() + "";
        passWord = "123456";
    }

    public User1(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }
}
