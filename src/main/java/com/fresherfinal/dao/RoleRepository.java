package com.fresherfinal.dao;

import org.springframework.data.repository.CrudRepository;
import com.fresherfinal.dto.Roles;

public interface RoleRepository extends CrudRepository<Roles, Integer> {
	
	Roles findByName(String name);
}
