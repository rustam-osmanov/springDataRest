package org.rustamosmanov.spring.springdatarest.dao;


import org.rustamosmanov.spring.springdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
