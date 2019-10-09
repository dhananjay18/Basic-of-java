package com.yash.trmapp.main;

import java.util.Scanner;

import com.yash.trmapp.dao.TrainingRequestDao;
import com.yash.trmapp.daoimpl.TrainingRequestDaoImpl;
import com.yash.trmapp.domain.TrainingRequest;
import com.yash.trmapp.util.MainMenu;

/**
 * This is Main class for application launching
 * @author Dhananjay
 *
 */
public class TrainingRequestMain
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int choice;
		MainMenu menu = new MainMenu();
		menu.appStart();
	
		TrainingRequest trainingRequest=new TrainingRequest();
		trainingRequest.setTrainingName("JAVA");
		trainingRequest.setTrainingDescription("JAVA DESCRIPTION");
		TrainingRequestDao trainingRequestDao=new TrainingRequestDaoImpl();
		
		trainingRequestDao.save(trainingRequest);
		//System.out.println(trainingRequest);
	}
}
