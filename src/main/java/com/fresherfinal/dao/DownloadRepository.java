package com.fresherfinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fresherfinal.dto.Download;

public interface DownloadRepository extends JpaRepository<Download, Integer> {

}
