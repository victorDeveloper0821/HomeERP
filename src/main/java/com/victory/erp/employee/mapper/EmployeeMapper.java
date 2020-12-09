package com.victory.erp.employee.mapper;

import com.victory.erp.employee.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {
/*
    public List<Employee> findEmployeeByName(@Param("empName") String empName);
*/

    public Employee findEmployeeByUserId(@Param("userId") String userId);

    public Employee findEmployeeByEmpId(@Param("empId") String empId);


    public void InsertEmployee(Employee employee);

//    public void deleteById(@Param("empId") String empId);
//
    public void updateEmployee(Employee employee);

}
