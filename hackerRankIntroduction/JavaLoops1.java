package hackerRankIntroduction;

import java.util.Scanner;

public class JavaLoops1 {
	public static void main (String args[]) {
		Scanner number = new Scanner (System.in);
		System.out.println("enter number whose table you want to see");
		int n = number.nextInt();
		
		for ( int b = 1 ; b <= 10 ; b++) {
			System.out.println(n+" * "+b+ " = "+n*b);
		}
	}
}
