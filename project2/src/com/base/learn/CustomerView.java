package com.base.learn;

/**
 * CustomerView 为主模块，负责菜单的显示和处理用户操作
 *
 * @author myf15609
 * @Date 2022/5/22
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("张三", '男', 23, "17717850143", "lanyecheng@126.com");
        customerList.addCustomer(customer);
    }

    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                    1 添 加 客 户");
            System.out.println("                    2 修 改 客 户");
            System.out.println("                    3 删 除 客 户");
            System.out.println("                    4 客 户 列 表");
            System.out.println("                    5 退      出\n");
            System.out.print("                  请选择(1-5)：");

            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出（Y/N）：");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        } while (isFlag);

    }

    /**
     * 添加客户操作
     */
    public void addNewCustomer() {
        System.out.println("---------------------------添加客户---------------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        // 将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------------添加成功---------------------------");
        } else {
            System.out.println("---------------------------添加失败---------------------------");
        }
    }

    /**
     * 修改客户操作,选择重新 new 对象的方式进行修改客户操作
     */
    public void modifyCustomer() {
        System.out.println("---------------------------修改客户---------------------------");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待修改客户的编号（-1退出）：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定的客户！");
            } else {
                break;
            }
        }
        // 修改客户相关信息
        System.out.print("姓名（" + cust.getName() + "):");
        String name = CMUtility.readString(10, cust.getName());
        System.out.print("性别（" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄（" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话（" + cust.getPhone() + "):");
        String phone = CMUtility.readString(13, cust.getPhone());
        System.out.print("邮箱（" + cust.getEmail() + "):");
        String email = CMUtility.readString(30, cust.getEmail());

        Customer newCust = new Customer(name, gender, age, phone, email);
        boolean isRepalaced = customerList.replaceCustomer(number - 1, newCust);
        if (isRepalaced) System.out.println("---------------------------修改成功---------------------------");
        else System.out.println("---------------------------修改失败---------------------------");
    }

    /**
     * 删除客户操作
     */
    public void deleteCustomer() {
        System.out.println("---------------------------删除客户---------------------------");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择待删除改客户的编号（-1退出）：");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定的客户！");
            } else {
                break;
            }
        }
        System.out.println("确认是否删除（Y/N）");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if(deleteSuccess) System.out.println("---------------------------删除成功---------------------------");
            else System.out.println("---------------------------删除失败---------------------------");
        }
    }

    /**
     * 显示客户列表操作
     */
    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        // 获取用户数量
        int total = customerList.getTotal();
        // 获取用户列表
        Customer[] custs = customerList.getAllCustomers();

        if (total == 0) {
            System.out.println("没有客户记录...");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t邮箱");
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t\t" + cust.getName() + "\t\t" + cust.getGender()
                        + "\t\t" + cust.getAge() + "\t\t" + cust.getPhone() + "\t\t" + cust.getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成--------------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
