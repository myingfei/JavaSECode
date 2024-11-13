package com.base7._abstract.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public class GeometricTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", 1.0, 2.3);
        Circle circle2 = new Circle("red", 1.0, 3.3);
        displayGeometricObject(circle1);
        displayGeometricObject(circle2);

        boolean isEquals = equalsArea(circle1, circle2);
        if (isEquals) {
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }

        displayGeometricObject(new MyRectangle("blue", 1.5, 2.0, 3.5));
    }

    /**
     * 几何图形的面积
     * @param g 对象
     */
    public static void displayGeometricObject(GeometricObject g) {
        System.out.println("几何图形的面积：" + g.findArea());
    }

    /**
     * 判断几何图形面积是否相等
     * @param g1 对象1
     * @param g2 对象2
     * @return true / false
     */
    public static boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

}
