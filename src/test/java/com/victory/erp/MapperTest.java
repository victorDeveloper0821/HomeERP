package com.victory.erp;

import com.victory.erp.domain.Employee;
import com.victory.erp.domain.Title;
import com.victory.erp.mapper.EmployeeMapper;
import com.victory.erp.mapper.TitleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class MapperTest {
    @Autowired
    EmployeeMapper mapper;
    @Autowired
    TitleMapper tmapper;

    @Test
    public void queryEmployee(){
        Employee employee = mapper.findEmployeeByEmpId("akfmrrpv");

        assertThat(employee).isNotNull();
        assertThat(employee.getTid()).isNotNull();
        assertThat(employee.getEmpName()).isEqualTo("Testing");
    }

    @Test
    public void InsertEmployee(){
        Title title = tmapper.findByEmpTitle(1770);
        Employee insertedEmployee = new Employee();
        insertedEmployee.setUserId("testaabc");
        insertedEmployee.setPassword("kdiuiajd");
        insertedEmployee.setEmpId("kdiuijd");
        insertedEmployee.setTid(title);
        insertedEmployee.setEmpName("randomInsert");

        int retval = mapper.InsertEmployee(insertedEmployee);
        System.out.println("retval : "+retval);
        assertThat(mapper.findEmployeeByUserId("testaabc")).isNotNull();
    }
}
