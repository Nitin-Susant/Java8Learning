package com.Java8Learning;


import com.Java8Learning.Repositerys.Employee1Repository;
import com.Java8Learning.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runners implements CommandLineRunner {
    @Autowired
    private Employee1Repository employee1Repository;

    @Autowired
    EmployeeService employeeService;


    @Override
    public void run(String... args) throws Exception {

        List<Employee1> employee1s = employeeService.getallEmployeeSalary();
        System.out.println("manash is good boy ");

        Sysout.out.println("susant is a good boy");

    }



}
