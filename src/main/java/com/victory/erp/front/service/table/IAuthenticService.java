package com.victory.erp.front.service.table;

import com.victory.erp.front.dto.LoginDTO;

public interface IAuthenticService {
    public LoginDTO login(String username, String password);

}
