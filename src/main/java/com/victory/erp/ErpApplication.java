package com.victory.erp;

import com.victory.erp.employee.domain.Employee;
import com.victory.erp.employee.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpApplication implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository employeeRepository ;
	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setEmpName("測試人員2");
		employee.setEmpTitle(124);
		employee.setUserId("victor");
		employee.setPassword("anckmjdk12345");

		Employee e = employeeRepository.findEmployeeByUserId("victor");

		System.out.println(e.getEmpId().concat(" ").concat(e.getEmpName()).concat(" ").concat(e.getUserId()));
	}
}
