package com.fresherfinal.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity(name="downloads")
public class Download {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int user_id;
	private int file_id;
	private java.util.Date date;
	
	public Download() {}
	
	
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getFile_id() {
		return file_id;
	}


	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	
	
}