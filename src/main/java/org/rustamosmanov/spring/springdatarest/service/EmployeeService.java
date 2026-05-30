package org.rustamosmanov.spring.springdatarest.service;


import org.rustamosmanov.spring.springdatajpa.entity.EmployeeBD;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeBD> getAllEmployees();

    public void saveEmployee(EmployeeBD employee);

    public void deleteEmployee(EmployeeBD employee);

    public EmployeeBD getEmployee(int id);

    public List<EmployeeBD> findAllByName(String firstName);

}
