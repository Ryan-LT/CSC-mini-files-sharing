package com.fresherfinal.dto;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name="roles")
public class Roles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	public Roles() {
		// TODO Auto-generated constructor stub
	}
	public Roles(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamerole() {
		return name;
	}
	public void setNamerole(String name) {
		this.name = name;
	}
	
}
