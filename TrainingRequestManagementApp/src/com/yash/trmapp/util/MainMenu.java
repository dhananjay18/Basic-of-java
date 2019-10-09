package com.yash.trmapp.util;

import java.util.Scanner;

/**
 * This class is for displaying different options for TraningReqest
 * @author Dhananjay
 *
 */
public class MainMenu {

	int choice;
	
	public void appStart() {	do
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------TraningRequestManagementApp----------");
		System.out.println("------------1.Add----------");
		System.out.println("------------2.ListAllRequests----------");
		System.out.println("------------3.Update----------");
		System.out.println("------------4.Delete----------");
		
		System.out.println("Enter your choice:");
		choice = scanner.nextInt();
		
	switch (choice)
	{
	case 1:
		System.out.println("Add");
		break;

	case 2:
		System.out.println("Display all training reuests");
		break;

	case 3:
		System.out.println("update");
		break;

	case 4:
		System.out.println("delete");
		break;

	default:
		
		System.exit(0);
		break;
	}
	System.out.println("do u want to continue press y");
	choice = scanner.next().charAt(0);
	}while(choice=='Y'||choice=='y');

		
		
	}

}
