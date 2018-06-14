package june7Assignment;

import java.util.Scanner;

public class Program7SinCosTen {
	public static void main (String args []) {
		Scanner in = new Scanner ( System.in);
		
		System.out.println("please enter a number");
		double a = in.nextDouble();
		
		System.out.println(Math.sin(a)+" sin of "+a);
		System.out.println(Math.cos(a)+" cos of "+a);
		System.out.println(Math.asin(a)+" asin of "+a);
		System.out.println(Math.acos(a)+" acos of "+a);
		System.out.println(Math.atan(a)+" atan of "+a);
		System.out.println(Math.log(a)+" log of "+a);
		System.out.println(Math.exp(a)+" exp of "+a);
		
	}

}
