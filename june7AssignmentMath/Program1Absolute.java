package june7Assignment;

import java.util.Scanner;

public class Program1Absolute {
	
	public static void main (String args []) {
	Scanner sc = new Scanner ( System.in);
	System.out.println("Please enter a number whose absolute value you want to find");
	int a = sc.nextInt();
	
	System.out.println("the absolute value of "+a+" is "+Math.abs(a));
	
	}
}
