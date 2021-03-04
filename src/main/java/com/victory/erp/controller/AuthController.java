package com.victory.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {
    @RequestMapping(value = "/login")
    public String loginPage(@RequestParam(value = "error",required = false) String err
            ,@RequestParam(value = "logout",required = false) String logout){
        return "";
    }


}
