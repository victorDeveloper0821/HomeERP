package com.victory.erp.employee.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("employee")
@Getter
@Setter
public class Employee {
    private String empId;

    private String empName;

    private Title Tid;

    private String userId ;

    private String password;

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empTitle=" + Tid +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
