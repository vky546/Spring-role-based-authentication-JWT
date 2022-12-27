package com.springsecurity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.model.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
	Role findRoleByName(String name);

}
