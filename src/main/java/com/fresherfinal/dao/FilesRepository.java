package com.fresherfinal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fresherfinal.dto.Files;

public interface FilesRepository extends JpaRepository<Files, Integer> {
//	@Query(value="SELECT ", nativeQuery=true)
//	List<Files> findFiles(String infoFile);
}
