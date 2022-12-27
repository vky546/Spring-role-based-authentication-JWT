package com.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.dao.RoleDao;
import com.springsecurity.model.Role;


@Service(value = "roleService")
public class RoleService {
	@Autowired
    private RoleDao roleDao;

   
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }

}
