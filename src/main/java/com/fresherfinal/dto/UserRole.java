package com.fresherfinal.dto;

import javax.persistence.*;

@Entity(name="user_role")
public class UserRole {
	@EmbeddedId
	private UserRoleID id;

	public UserRoleID getId() {
		return id;
	}

	public void setId(UserRoleID id) {
		this.id = id;
	}
}

@Embeddable
class UserRoleID{
	private int user_id;
	private int role_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
}
