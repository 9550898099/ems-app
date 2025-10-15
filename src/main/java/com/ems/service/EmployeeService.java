package com.ems.service;

import com.ems.entity.Employee;
import com.ems.repository.EMSRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EMSRespository emsRespository;

    public EmployeeService(EMSRespository emsRespository) {
        this.emsRespository = emsRespository;
    }
    // for every operation to get data from DB JPA repository has the inbuild methods
    // logic to perform the database operations
    public List<Employee> getEmployees(){
        return emsRespository.findAll();
    }

    public Optional<Employee> getEmployeeByID(Long id){
       return emsRespository.findById(id);
    }

    public Employee saveEmployee(Employee employee){
        return emsRespository.save(employee);
    }

    public void deleteEmployee(Long id){
        emsRespository.deleteById(id);
    }
}
