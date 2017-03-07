package com.fresherfinal.dto;

import javax.persistence.*;

@Entity(name="user_role")
public class UserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	
}
