package com.Java8Learning.Cache;


import com.Java8Learning.Entitys.Employee1;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EmployeeCaches {

    Map<String, Employee1> employee1;


    @PostConstruct
    public void EmployeeCaches(){
        loadEmployee1Cache();
    }

    private void loadEmployee1Cache() {
        System.out.println("loading employee cache");

    }

}
