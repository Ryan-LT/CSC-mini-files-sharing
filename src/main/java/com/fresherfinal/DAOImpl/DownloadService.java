package com.fresherfinal.DAOImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresherfinal.dao.DownloadRepository;

@Service
public class DownloadService {
	
	@Autowired
	DownloadRepository downloadRepository;
	
	
}
