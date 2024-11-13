package com.base8._interface.jdk8;

/**
 * @Author myf15609
 * @Date 2023/8/24
 */
public interface CompareA {
    // 属性：必须使用 public static final 修饰
    // jdk8 之前，只能声明抽象方法

    // 方法：jdk8 中，静态方法
    public static void method1() {
        System.out.println("CompareA:北京");
    }

    //方法：jdk8中：默认方法
    public default void method2() {
        System.out.println("CompareA:上海");
    }

    public default void method3() {
        System.out.println("CompareA:广州");
    }

    public default void method4() {
        System.out.println("CompareA:深圳");
    }
    // jdk9新特性：定义私有方法
//    private void method5(){
//        System.out.println("我是接口中定义的私有方法");
//    }
}
