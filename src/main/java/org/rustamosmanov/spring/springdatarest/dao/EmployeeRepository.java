package org.rustamosmanov.spring.springdatarest.dao;


import org.rustamosmanov.spring.springdatajpa.entity.EmployeeBD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeBD, Integer> {
    public List<EmployeeBD> findAllByName(String firstName);
}
