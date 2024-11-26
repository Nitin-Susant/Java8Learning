package com.Java8Learning.Repositerys;

import com.Java8Learning.Entitys.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee1Repository extends JpaRepository<Employee1, Long> {
}

