package com.fresherfinal.DAOImpl;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresherfinal.dao.RanksRepository;
import com.fresherfinal.dto.Ranks;


@Service
public class RanksService{
	@Autowired
	RanksRepository rankRepository;
}
