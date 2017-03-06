package com.fresherfinal.DAOImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fresherfinal.dao.FilesRepository;


@Service
public class FilesService {
	@Autowired
	FilesRepository fileRepository;
	
}
