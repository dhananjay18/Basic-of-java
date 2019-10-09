package com.yash.trmapp.dao;

import com.yash.trmapp.domain.TrainingRequest;


/**
 * This is interface for traningRequestsDao
 * @author Dhananjay
 *
 */
public interface TrainingRequestDao {
	
	/**
	 * This method is for saving the training requests
	 * @param trainingRequest
	 */
	public void save(TrainingRequest trainingRequest);
	
	public void find(long id);
	
	public void update(long id);
	
	public void delete(long id);

}
