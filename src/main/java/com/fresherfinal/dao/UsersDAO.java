package com.fresherfinal.dao;

import com.fresherfinal.dto.Users;

public interface UsersDAO extends InterFaceDAO<Users> {
	/**
	 * This is the method to be use to update rank of user 
	 * @param id
	 * @param IDrank
	 */
	void updateRank(Integer id, Integer IDrank);
	
	/**
	 * This is the method to be use to change password of user
	 * @param id
	 * @param oldPassword
	 * @param newPassword
	 */
	void changePassword(Integer id, String oldPassword, String newPassword);
	
}
