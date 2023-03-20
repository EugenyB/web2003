package com.example.web2003.beans;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

    private String userName;

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getUserName() {
        return userName;
    }
}
