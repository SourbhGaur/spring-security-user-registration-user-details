package com.srbhgaur.springsecurity.demo.dao;

import com.srbhgaur.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);

}
