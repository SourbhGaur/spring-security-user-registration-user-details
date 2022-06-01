package com.srbhgaur.springsecurity.demo.dao;

import com.srbhgaur.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User user);

}
