package com.base3._override.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kids = new Kids();
        kids.setSex(1);
        kids.setSalary(100);
        kids.setYearsOld(12);
        System.out.println(kids.getYearsOld());

        kids.emplayeed();
        kids.manOrWoman();
    }
}
