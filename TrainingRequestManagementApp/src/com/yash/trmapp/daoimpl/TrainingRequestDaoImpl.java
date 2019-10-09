package com.yash.trmapp.daoimpl;


import java.util.ArrayList;
import java.util.List;

import com.yash.trmapp.dao.TrainingRequestDao;
import com.yash.trmapp.domain.TrainingRequest;

public class TrainingRequestDaoImpl implements TrainingRequestDao
{
	int counter;
	
	
	public TrainingRequestDaoImpl() {
	
		counter=0;
		TrainingRequest trainingRequest[] = new TrainingRequest[10];
		List<TrainingRequest> trainingRequests=new ArrayList<TrainingRequest>();
		
		for(int i=0;i<counter;i++) {
			for (TrainingRequest trainingReq : trainingRequests) {
				
				trainingRequest[i]=trainingReq;
				counter++;
			}
			
		}
		
	}
		
	
	@Override
	public void save(TrainingRequest trainingRequest) {
			
//		List<TrainingRequest> trainingRequests = new ArrayList<TrainingRequest>();
//		trainingRequests.add(trainingRequest);
//		System.out.println(trainingRequests);
//		List<TrainingRequest> trainingRequests=new ArrayList<TrainingRequest>();
//		trainingRequests.add(trainingRequest);
//		for (TrainingRequest trainingReq : trainingRequests) {
//			
//			System.out.println(trainingReq);
//			
//		}
		
	}

	@Override
	public void find(long id) {
		// TODO Auto-generated method stub

	}
	@Override
	public void update(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}
	

	

}
