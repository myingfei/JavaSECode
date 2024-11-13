package com.base.learn;

/**
 * @Author myf15609
 * @Date 2023/4/5
 * 简单的家庭收支练习，主要针对之前学习的知识点进行回顾
 */
public class FamilyAccount {
    public static void main(String[] args) {
        String details = "收支\t\t账户金额\t\t收支金额\t\t说明\n";
        int balance = 10000;
        boolean isFlag = true;

        do {
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                    1 收支明细");
            System.out.println("                    2 登记收入");
            System.out.println("                    3 登记支出");
            System.out.println("                    4 退    出\n");
            System.out.print("                  请选择< 1~4 > ");

            char menu = Utility.readMenuSelection();
            switch (menu) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("------------------------------------------------");
                    break;

                case '2':
                    System.out.print("本次收入金额：");
                    int money1 = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info1 = Utility.readString();
                    balance += money1;
                    details += "收入\t\t" + balance + "\t\t" + money1 + "\t\t" + info1 + "\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;

                case '3':
                    System.out.print("本次支出金额：");
                    int money2 = Utility.readNumber();
                    if (balance > money2) {
                        balance -= money2;
                    } else {
                        System.out.println("支出超出账户可用额度！！！");
                        break;
                    }
                    System.out.print("本次支出说明：");
                    String info2 = Utility.readString();
                    details += "支出\t\t" + balance + "\t\t" + money2 + "\t\t" + info2 + "\n";
                    System.out.println("---------------------登记完成---------------------");
                    break;

                case '4':
                    System.out.print("请确认是否退出(Y/N): ");
                    char exit = Utility.readConfirmSelection();
                    if (exit == 'Y') isFlag = false;
                    break;
            }
        } while (isFlag);
    }
}