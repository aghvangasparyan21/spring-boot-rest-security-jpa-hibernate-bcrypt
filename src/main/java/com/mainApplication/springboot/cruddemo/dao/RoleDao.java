package com.mainApplication.springboot.cruddemo.dao;

import com.mainApplication.springboot.cruddemo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
