package com.victory.erp.mapper;

import com.victory.erp.domain.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
/*
    public List<Employee> findEmployeeByName(@Param("empName") String empName);
*/

    public Employee findEmployeeByUserId(@Param("userId") String userId);

    public Employee findEmployeeByEmpId(@Param("empId") String empId);


    public int InsertEmployee(Employee employee);

//    public void deleteById(@Param("empId") String empId);
//
    public void updateEmployee(Employee employee);

}
