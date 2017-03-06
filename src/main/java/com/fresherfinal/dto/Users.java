package com.fresherfinal.dto;

import javax.persistence.*;

@Entity(name="users")
public class Users {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String displayname;

    private String email;
    
    private String password;
    
    private int rank_id;
    
    private int role_id;
    
    private int lock;
    
    private String note;
    
    public Users() {}
    public Users(String name, String emai, String password, int rank_id, int lock, String note){
    	this.displayname = name;
    	this.email = emai;
    	this.password = password;
    	this.rank_id = rank_id;
    	this.lock = lock;
    	this.note=note;
    }
    public Users(String name, String emai, String password, int rank_id){
    	this.displayname = name;
    	this.email = emai;
    	this.password = password;
    	this.rank_id = rank_id;
    	this.lock = 0;
    	this.note = "";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRank_id() {
		return rank_id;
	}

	public void setRank_id(int rank_id) {
		this.rank_id = rank_id;
	}

	public int getLock() {
		return lock;
	}

	public void setLock(int lock) {
		this.lock = lock;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
}
