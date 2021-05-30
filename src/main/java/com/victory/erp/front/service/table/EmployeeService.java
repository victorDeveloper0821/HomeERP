package com.victory.erp.front.service.table;

import com.victory.erp.domain.Employee;
import com.victory.erp.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    public EmployeeMapper employeeMapper;

    @Override
    public Optional<Employee> findByUserId(String userId) {
        Employee emp =  employeeMapper.findEmployeeByUserId(userId);
        if(Objects.nonNull(emp)){
            return Optional.of(emp);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public Optional<Employee> findByEmpId(String empId) {
        Employee emp = employeeMapper.findEmployeeByEmpId(empId);
        if(Objects.nonNull(emp)){
            return Optional.of(emp);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public int InsertEmployee(Employee employee) {
        return employeeMapper.InsertEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
