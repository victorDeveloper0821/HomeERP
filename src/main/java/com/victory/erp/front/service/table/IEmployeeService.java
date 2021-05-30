package com.victory.erp.front.service.table;

import com.victory.erp.domain.Employee;

import java.util.Optional;

public interface IEmployeeService {
    public Optional<Employee> findByUserId(String userId);

    public Optional<Employee> findByEmpId(String empId);

    public int InsertEmployee(Employee employee);

    public void updateEmployee(Employee employee);
}
