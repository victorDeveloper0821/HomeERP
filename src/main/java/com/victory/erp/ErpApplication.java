package com.victory.erp;

import com.victory.erp.employee.domain.Employee;
import com.victory.erp.employee.mapper.EmployeeMapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.victory.erp.employee.mapper")
@SpringBootApplication
public class ErpApplication implements CommandLineRunner {
	@Autowired
	private EmployeeMapper mapper;
	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = mapper.findEmployeeByEmpId("akfmrrpv");
		System.out.println(employee);
		System.out.println(employee.getEmpTitle());
	}
}
