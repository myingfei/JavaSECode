package com.base5._polymorphism.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest tt = new GeometricTest();

        Circle c1 = new Circle("red", 1.0, 2.3);
        Circle c2 = new Circle("red", 1.0, 3.3);

        tt.dispplayGeometricObject(c1);
        tt.dispplayGeometricObject(c2);

        if (tt.equalsArea(c1, c2)) {
            System.out.println("面积相等");
        }else {
            System.out.println("面积不相等");
        }

        // 使用匿名对象
        tt.dispplayGeometricObject(new MyRectangle("blue", 1.0, 3.5, 2.0));

    }

    /**
     * 判断两个对象的面积是否相等
     * @param g1 对象1
     * @param g2 对象2
     * @return true / false
     */
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    /**
     * 显示对象面积
     * @param geometricObject 对象
     */
    public void dispplayGeometricObject(GeometricObject geometricObject) {
        System.out.println("面积为：" + geometricObject.findArea());
    }
}
