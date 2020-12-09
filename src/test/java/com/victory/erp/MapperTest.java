package com.victory.erp;

import com.victory.erp.employee.domain.Employee;
import com.victory.erp.employee.domain.Title;
import com.victory.erp.employee.mapper.EmployeeMapper;
import com.victory.erp.employee.mapper.TitleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

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
        insertedEmployee.setUserId("testaaaa");
        insertedEmployee.setPassword("alfkfv,ss");
        insertedEmployee.setEmpId("ajfkrle");
        insertedEmployee.setTid(title);
        insertedEmployee.setEmpName("測試人員");

        mapper.InsertEmployee(insertedEmployee);
//        assertThat(retVal).isEqualTo(1);
        assertThat(mapper.findEmployeeByUserId("testaaaa")).isNotNull();
    }
}
