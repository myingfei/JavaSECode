package com.base.learn.service;

import com.base.learn.domain.*;
import static com.base.learn.service.Data.*;

/**
 * @Author myf15609
 * @Date 2023/9/11
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 根据项目提供的 Data 类构建相应大小的 employees 数组
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < EMPLOYEES.length; i++) {
            // 员工的类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            // 获得通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                     break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * 创建领用设备
     * @param index 位置
     * @return 创建领用设备
     */
    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelName = EQUIPMENTS[index][1];
        String priceOrDisplayOrType = EQUIPMENTS[index][2];
        switch (equipmentType) {
            case PC:
                return new PC(modelName, priceOrDisplayOrType);
            case NOTEBOOK:
                double price = Double.parseDouble(priceOrDisplayOrType);
                return new NoteBook(modelName, price);
            case PRINTER:
                return new Printer(modelName, priceOrDisplayOrType);
        }
        return null;
    }

    /**
     * 获取当前的所有员工
     * @return 员工
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定ID的员工对象
     * @param id 指定员工的ID
     * @return 指定员工对象
     * @throws TeamException 找不到指定的员工
     */
    public Employee getEmployee(int id) throws TeamException {
        for (Employee e: employees) {
            if (id == e.getId())
                return e;
        }
        throw new TeamException("找不到指定的员工");
    }
}
