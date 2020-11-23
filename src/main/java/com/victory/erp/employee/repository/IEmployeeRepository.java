package com.victory.erp.employee.repository;

import com.victory.erp.employee.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IEmployeeRepository {
    @Select("select * from Employee where empName = #{empName}")
    public List<Employee> findEmployeeByName(@Param("empName") String empName);

    @Select("select * from Employee where userId = #{userId}")
    public Employee findEmployeeByUserId(@Param("userId") String userId);

    @Insert("Insert into Employee (empId,empName,empTitle,userId,password) values (#{empId},#{empName},#{empTitle},#{userId},#{password})")
    @SelectKey(keyProperty = "empId", resultType = String.class, before = true,
            statement = "select replace(uuid(), '-', '') as empId")
    public int InsertEmployee(Employee employee);

    @Delete("Delete from Employee where empId = #{empId} ")
    public void deleteById(@Param("empId") String empId);

    @Update("Update Employee set empName=#{empName}, empTitle=#{empTitle}, password=#{password} where empId = #{empId}")
    public void updateEmployee(Employee employee);
}
