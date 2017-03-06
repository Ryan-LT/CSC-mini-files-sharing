package com.fresherfinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresherfinal.dto.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findByEmail(String email);
}
