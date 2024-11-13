package com.base8._interface.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/23
 */
public class ComparableCircle extends Circle implements  CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(this.getRadius(), c.getRadius());
        }else {
//            return 2;
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
