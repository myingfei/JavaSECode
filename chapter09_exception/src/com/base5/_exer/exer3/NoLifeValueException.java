package com.base5._exer.exer3;

/**
 * @Author myf15609
 * @Date 2023/9/10
 */
public class NoLifeValueException extends RuntimeException{

    static final long serialVersionUID = -70312323145766939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
