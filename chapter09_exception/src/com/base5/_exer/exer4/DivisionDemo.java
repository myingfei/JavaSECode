package com.base5._exer.exer4;

/**
 * @Author myf15609
 * @Date 2023/9/10
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int result = divide(m, n);
            System.out.println("结果为：" + result);

        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("除0");
        } finally {
            System.out.println("finally");
        }
    }


    public static int divide(int m, int n) throws BelowZeroException{
        if(m < 0 || n < 0) {
            throw new BelowZeroException("输入的数值为负数");
        }
        return m / n;
    }
}
