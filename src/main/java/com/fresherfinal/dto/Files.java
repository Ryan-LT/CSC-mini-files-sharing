package com.fresherfinal.dto;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name="files")
public class Files {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String namefile;
	private int user_id;
	private String path;
	private Date dateupload;
	private double size;
	
	public Files() {}
	
	public Files(String namefile, int user_id, String path, Date dateupload, double size) {
		this.namefile = namefile;
		this.user_id = user_id;
		this.path = path;
		this.dateupload = dateupload;
		this.size = size;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamefile() {
		return namefile;
	}
	public void setNamefile(String namefile) {
		this.namefile = namefile;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getDateupload() {
		return dateupload;
	}
	public void setDateupload(Date dateupload) {
		this.dateupload = dateupload;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
}
