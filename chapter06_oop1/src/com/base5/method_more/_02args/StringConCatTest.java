package com.base5.method_more._02args;

/**
 * n个字符串进行拼接，每个字符串之间使用某个字符进行分割，如果没有传入字符串，那么返回空字符串
 *
 * @Author myf15609
 * @Date 2023/4/14
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest stringConCatTest = new StringConCatTest();
        String info = stringConCatTest.conCat("-", "hello", "world");
        System.out.println(info);
        System.out.println(stringConCatTest.conCat("/", "hello", "world"));
        System.out.println(stringConCatTest.conCat("/", "hello"));
        System.out.println(stringConCatTest.conCat("-" ));

    }

    public String conCat(String operator, String ... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += operator + strs[i];
            }
        }

        return result;
    }
}
