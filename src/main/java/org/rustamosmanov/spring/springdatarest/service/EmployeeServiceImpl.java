package org.rustamosmanov.spring.springdatarest.service;

import org.rustamosmanov.spring.springdatajpa.dao.EmployeeRepository;
import org.rustamosmanov.spring.springdatajpa.entity.EmployeeBD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeBD> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @Override
    public void saveEmployee(EmployeeBD employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(EmployeeBD employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public EmployeeBD getEmployee(int id) {
        EmployeeBD employeeBD = null;
        Optional<EmployeeBD> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            employeeBD = employee.get();
        }
        return employeeBD;
    }

    public List<EmployeeBD> findAllByName(String firstName) {
        return employeeRepository.findAllByName(firstName);
    }

}
