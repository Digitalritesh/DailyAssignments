package june7Assignment;

import java.util.Scanner;

public class Program2RoundOff {
	public static void main (String args []) {
		Scanner in = new Scanner ( System.in);
		System.out.println("Please enter a number with decimal point");
		double a = in.nextDouble();
		
		System.out.println(Math.round(a));
		
	}
}
