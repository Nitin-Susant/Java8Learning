package com.Java8Learning.Controllers;


import com.Java8Learning.Entitys.Employee1;
import com.Java8Learning.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpolyeeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployee1")
    public ResponseEntity<List<Employee1>> getEmployee() {
        List<Employee1> employee1s = employeeService.getallEmployee();
        return new ResponseEntity<>(employee1s, HttpStatus.OK);
    }

    @GetMapping("/getEmployeesalary1")
    public ResponseEntity<List<Employee1>> getEmployeeBySalary() {
        List<Employee1> employee1s = employeeService.getallEmployeeSalary();
        return new ResponseEntity<>(employee1s, HttpStatus.OK);
    }


    @GetMapping("/getEmployeesalaryonly1")
    public ResponseEntity<List<Double>> getEmployeeBySalaryOnly() {
        List<Double> salary = employeeService.getallEmployeeSalaryonly();
        return new ResponseEntity<>(salary, HttpStatus.OK);
    }


}
