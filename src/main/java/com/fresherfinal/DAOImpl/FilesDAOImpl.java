package com.fresherfinal.DAOImpl;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fresherfinal.dao.FilesDAO;
import com.fresherfinal.dto.Files;

public class FilesDAOImpl implements FilesDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void getDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Files item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Files getItem(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Files> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
