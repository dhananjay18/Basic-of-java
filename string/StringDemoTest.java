package string;

import java.util.Scanner;

public class StringDemoTest {
	public static void main(String[] args) {
		StringDemo demo= new StringDemo();
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the str");
	String str=sc.nextLine();
	demo.stringreturn(str);
	}

}
