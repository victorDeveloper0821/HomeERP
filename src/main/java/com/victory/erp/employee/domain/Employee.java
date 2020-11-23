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

    private Integer empTitle;

    private String userId ;

    private String password;
}
