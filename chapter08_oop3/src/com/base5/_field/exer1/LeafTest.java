package com.base5._field.exer1;

/**
 * 判断加载顺序
 * 由父及子，静态先行
 */

class Root {
    static {
        System.out.println("Root 的静态代码块");
    }

    {
        System.out.println("Root 的普通代码块");
    }

    public Root() {
        System.out.println("Root 空参构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid 的静态代码块");
    }

    {
        System.out.println("Mid 的普通代码块");
    }

    public Mid() {
        System.out.println("Mid 空参构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid 带参构造器 " + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf 的静态代码块");
    }

    {
        System.out.println("Leaf 的普通代码块");
    }

    public Leaf() {
        super("天天向上");
        System.out.println("Leaf 空参构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        System.out.println("--------------");
        new Leaf();
    }
}
