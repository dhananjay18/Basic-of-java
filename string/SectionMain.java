package string;

import java.util.Date;
import java.util.Scanner;

public class SectionMain {
	public static void main(String[] args) {
		Section section= new Section();
		section.setId(101);
	   section.setDate("31/2/2015");
	   section.setName("ram");
		System.out.println(section.showDetails());
		
	}

}
