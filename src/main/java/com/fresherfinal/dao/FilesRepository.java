package com.fresherfinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresherfinal.dto.Files;

public interface FilesRepository extends JpaRepository<Files, Integer> {
	
}
