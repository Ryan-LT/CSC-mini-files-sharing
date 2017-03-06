package com.fresherfinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresherfinal.dto.Ranks;

public interface RanksRepository extends JpaRepository<Ranks, Integer> {
	
}
