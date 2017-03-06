package com.fresherfinal.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity(name="downloads")
public class Download {
	@EmbeddedId
	private id_Download id;
	private java.util.Date date;
	
	public Download() {}
	public Download(id_Download id, java.util.Date date) {
		this.id = id;
		this.date = date;
	}
	
	public id_Download getId() {
		return id;
	}
	public void setId(id_Download id) {
		this.id = id;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	
}

@Embeddable
class id_Download implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int user_id;
	private int file_id;
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