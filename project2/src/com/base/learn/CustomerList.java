package com.base.learn;

/**
 * CustomerList 为 Customer 对象的管理模块
 *
 * @author myf15609
 * @Date 2022/5/22
 */
public class CustomerList {
    private Customer[] customers; // 用来保存客户对象的数组
    private int total; // 记录已经保存客户对象的数量

    /**
     * 用来初始化 customers 数组的构造器
     *
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的客户添加到数组中
     *
     * @param customer 用户
     * @return true:添加成功、false:添加失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        // 将指定客户添加到数组中，并 total +1
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定位置的客户信息
     *
     * @param index 索引位置
     * @param cust  用户
     * @return true:修改成功、false:修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        // index 索引取值必须在[0, total)
        if (index >= total || index < 0) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置的客户信息
     *
     * @param index 索引位置
     * @return true:修改成功、false:修改失败
     */
    public boolean deleteCustomer(int index) {
        // index 索引取值必须在[0, total)
        if (index >= total || index < 0) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        // 最后的元素需要置为null
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有的客户信息
     *
     * @return custs[]
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     *
     * @param index 索引位置
     * @return 如果找到了元素，则返回；如果没有找到则返回 null
     */
    public Customer getCustomer(int index) {
        if (index >= total || index < 0) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户数量
     *
     * @return total
     */
    public int getTotal() {
        return total;
    }
}
