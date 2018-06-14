package june7Assignment;

import java.util.Scanner;

public class Program4Ceiling {
	public static void main ( String args []) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("please enter a number");
		Double a = sc.nextDouble();
		
		System.out.println(Math.ceil(a));
	}
}
