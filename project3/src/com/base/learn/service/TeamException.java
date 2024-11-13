package com.base.learn.service;

/**
 * @Author myf15609
 * @Date 2023/9/11
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -338751699229948L;

    public TeamException() {

    }

    public TeamException(String message) {
        super(message);
    }
}
