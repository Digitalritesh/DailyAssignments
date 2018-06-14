package june7Assignment;

import java.util.Scanner;

public class Program8SqRoot {
	public static void main ( String args []) {
		Scanner in = new Scanner (System.in);
		System.out.println("please enter the number whose square root you want; ");
		double a = in.nextDouble();
		
		System.out.println(Math.sqrt(a));		
		
	}
}
