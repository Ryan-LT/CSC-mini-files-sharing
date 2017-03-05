package com.fresherfinal.dao;

import com.fresherfinal.dto.Ranks;

public interface RanksDAO extends InterFaceDAO<Ranks> {
	/**
	 * this is the method to be use to update size of rank
	 * @param id
	 * @param size
	 */
	void updateSize(Integer id, double size);
}
