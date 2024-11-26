package com.Java8Learning.Services;


import com.Java8Learning.Entitys.Employee1;
import com.Java8Learning.Repositerys.Employee1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {


    @Autowired
    Employee1Repository employee1Repository;


    public List<Employee1> getallEmployee() {
        List<Employee1> all = employee1Repository.findAll();
        return all;
    }

    public List<Employee1> getallEmployeeSalary() {
        List<Employee1> all = employee1Repository.findAll();

        List<Employee1> collect = all.stream().filter(emp -> {
                    if (emp.getSalary() > 60000) {
                        return true;
                    } else return false;
                })
                .collect(Collectors.toList());

        return collect;
    }

    public List<Double> getallEmployeeSalaryonly() {
        List<Employee1> all = employee1Repository.findAll();
        List<Double> collect = all.stream().map(emp -> {
            return emp.getSalary();
        }).collect(Collectors.toList());

        return collect;
    }








}
