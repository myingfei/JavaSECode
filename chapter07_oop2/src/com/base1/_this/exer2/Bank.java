package com.base1._this.exer2;

/**
 * @Author myf15609
 * @Date 2023/8/19
 */
public class Bank {
    private int numberOfCustomer; // 用于记录存储的客户数量
    private Customer[] customers; // 用于保存多个客户

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param f 姓
     * @param l 名
     */
    public void addCustomer(String f, String l) {
        Customer cus = new Customer(f, l);
        customers[numberOfCustomer++] = cus;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index 索引位置
     * @return 返回客户对象
     */
    public Customer getCustomer(int index) {
        if(index < 0 || index >= numberOfCustomer) {
            return null;
        }
        return customers[index];
    }


    /**
     * 获取客户列表中存储的客户数量
     * @return 数量
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
