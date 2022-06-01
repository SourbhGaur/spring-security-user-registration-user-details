package com.srbhgaur.springsecurity.demo.service;

import com.srbhgaur.springsecurity.demo.entity.User;
import com.srbhgaur.springsecurity.demo.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
