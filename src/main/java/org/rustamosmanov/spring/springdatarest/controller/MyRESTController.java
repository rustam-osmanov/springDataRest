package org.rustamosmanov.spring.springdatarest.controller;


import org.rustamosmanov.spring.springdatajpa.entity.EmployeeBD;
import org.rustamosmanov.spring.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping
    public String api() {
        return "API is working";
    }

    @GetMapping("/employees")
    public List<EmployeeBD> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public EmployeeBD getEmployeeById(@PathVariable("id") int id) {
        EmployeeBD employeeBD = employeeService.getEmployee(id);
        return employeeBD;
    }

    @PostMapping("/employees")
    public EmployeeBD addNewEmployee(@RequestBody EmployeeBD employeeBD) {
        employeeService.saveEmployee(employeeBD);
        return employeeBD;
    }

    @PutMapping("/employees")
    public EmployeeBD updateEmployee(@RequestBody EmployeeBD employeeBD) {
        employeeService.saveEmployee(employeeBD);
        return employeeBD;
    }

    @DeleteMapping("/employees/{id}")
    public EmployeeBD deleteEmployeeById(@PathVariable("id") int id) {
        EmployeeBD employeeBD = employeeService.getEmployee(id);
        employeeService.deleteEmployee(employeeBD);
        return employeeBD;
    }

    @GetMapping("/employees/name/{name}")
    public List<EmployeeBD> getEmployeeByName(@PathVariable("name") String name) {
        List<EmployeeBD> employees = employeeService.findAllByName(name);
        return employees;
    }

}
