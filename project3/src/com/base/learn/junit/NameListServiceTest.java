package com.base.learn.junit;

import com.base.learn.domain.Employee;
import com.base.learn.service.NameListService;
import com.base.learn.service.TeamException;
import org.junit.Test;

/**
 * @Author myf15609
 * @Date 2023/9/11
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee() {
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            id = 14;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
