package com.victory.erp.config;

import com.victory.erp.security.LoginFailHandler;
import com.victory.erp.security.LoginSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoginSuccessHandler loginSuccessHandler;
    @Autowired
    private LoginFailHandler loginFailHandler;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().and()
                .formLogin().loginPage("")
                .successHandler(loginSuccessHandler)
                .failureHandler(loginFailHandler);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
        auth.inMemoryAuthentication()
                .withUser("victor")
                .password("{noop}12345678")
                .roles("user")
                .and()
                .withUser("princeoftennis")
                .password("aanncccdd")
                .roles("user");
    }
}
