package com.endava.jpa.main;

import com.endava.jpa.model.Department;
import com.endava.jpa.model.Employee;
import com.endava.jpa.service.impl.JPAMainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JPAMainService jpaMainService = (JPAMainService) context.getBean("JPAMainService");

        //-------------------------------------- Department -----------------------------/


        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();
        department1.setName("hr");
        //	jpaMainService.insertDepartment(department1);
        department2.setName("dev");
        //	jpaMainService.insertDepartment(department2);
        department3.setName("testing");
        //  jpaMainService.insertDepartment(department3);
        department1.setName("other");
        //	jpaMainService.updateDepartment(department1);
        //	jpaMainService.deleteDepartment(department2);

        //-------------------------------------- Employee -----------------------------/

        Employee employee1 = new Employee();

        employee1.setName("Ben");
        employee1.setCity("Bucharest");
        employee1.setSalary(2000);
        employee1.setState("Romania");
        employee1.setStreet("Main");
        employee1.setZip_code("1000");
        employee1.setBirthday(new Date());
        employee1.setDepartment(department1);
        //jpaMainService.insertEmployee(employee1);

        Employee employee2 = new Employee();

        employee2.setName("Sara");
        employee2.setCity("Bucharest");
        employee2.setSalary(2400);
        employee2.setState("Romania");
        employee2.setStreet("Main");
        employee2.setZip_code("1800");
        employee2.setBirthday(new Date());
        employee2.setDepartment(department1);
        //	jpaMainService.insertEmployee(employee2);

        jpaMainService.getEmployeesFromBucharest();

        //jpaMainService.giveSalaryRaise();
        //jpaMainService.removeEmployee();


    }
}
