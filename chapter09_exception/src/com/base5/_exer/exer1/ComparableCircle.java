package com.base5._exer.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/23
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) throws Exception {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(this.getRadius(), c.getRadius());
        } else {
            throw new Exception("输入的类型不匹配");
        }
    }
}
