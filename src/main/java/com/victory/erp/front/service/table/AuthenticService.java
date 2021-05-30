package com.victory.erp.front.service.table;

import com.victory.erp.domain.Employee;
import com.victory.erp.front.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticService implements IAuthenticService {

    @Autowired
    private IEmployeeService employeeService;

    @Override
    public LoginDTO login(String username, String password) {
        Optional<Employee> optional = employeeService.findByUserId(username);
        String actualPasswd = optional.map(emp -> emp.getPassword()).orElseGet(()->{
            System.out.println("password is null !");
            return "";
        });
        LoginDTO loginDTO = new LoginDTO();
        if(optional.isPresent()){
            if(actualPasswd.equals(password)){
                loginDTO.setMessage("Login Success");
                loginDTO.setStatus("Y");
            }else{
                loginDTO.setMessage("error password or username");
                loginDTO.setStatus("N");
            }
        }else{
            loginDTO.setMessage("Login failed");
            loginDTO.setStatus("N");
        }
        return loginDTO ;
    }
}
