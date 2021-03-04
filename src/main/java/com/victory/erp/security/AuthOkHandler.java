package com.victory.erp.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthOkHandler implements AuthenticationSuccessHandler {
    private final String LOGGED_IN = "logged_in";
    private final String USER_TYPE = "user_type";

    @Override
    public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res
            , Authentication auth) throws IOException, ServletException {

    }
}
