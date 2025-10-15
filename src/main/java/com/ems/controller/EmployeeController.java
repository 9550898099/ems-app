package com.ems.controller;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    // get all the employees
    @GetMapping("/all")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    // get employee based on ID
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeByID(id);
    }

    // add employee or save employee
    @PostMapping
    public Employee createEmployee(@RequestBody @Valid Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully...!!! for the ID:"+ id;
    }

}
