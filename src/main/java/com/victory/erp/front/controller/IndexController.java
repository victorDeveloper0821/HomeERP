package com.victory.erp.front.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {


    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public String Index(HttpServletRequest req, HttpServletResponse res){
        return "login";
    }

    @RequestMapping(value = "/login",method = {RequestMethod.POST},produces = "application/json; charset=utf-8;")
    @ResponseBody
    public ResponseEntity loginResponse(){
        return null;
    }
}
