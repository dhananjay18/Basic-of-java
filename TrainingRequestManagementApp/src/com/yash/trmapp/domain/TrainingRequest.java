
package com.yash.trmapp.domain;

import java.util.Date;

/**
 * This class is all about training request
 * @author Dhananjay
 *
 */
public class TrainingRequest {
	/**
	 * id represent the trainer id
	 */
	public long id;
	/*
	 * title  represent training title
	 * */
	public String trainingTitle;
	/*
	 * trainingDescription represents description about training program
	 * */
	public String trainingDescription;
	/*
	 * startDate represents start date of the  training program
	 * */
	public Date startDate;
	/*
	 * endDate represents end date of the  training program
	 * */
	public Date endDate;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTrainingName() {
		return  trainingTitle;
	}
	
	public void setTrainingName(String  trainingTitle) {
		this. trainingTitle =  trainingTitle;
	}
	
	public String getTrainingDescription() {
		return trainingDescription;
	}
	
	public void setTrainingDescription(String trainingDescription) {
		this.trainingDescription = trainingDescription;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	

}
