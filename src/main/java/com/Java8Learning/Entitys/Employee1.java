package com.Java8Learning.Entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee1",schema = "level1") // Maps to the "employee" table in the database
@Data
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID for each employee
    private Long id;

    @Column(unique = true, nullable = false)
    private String empid; // Unique employee ID as a string


    private String name;
    private String department;
    private double salary;

  }