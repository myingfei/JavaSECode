package com.base5._exer.exer4;

/**
 * @Author myf15609
 * @Date 2023/9/10
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -33875169924229948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }
}
