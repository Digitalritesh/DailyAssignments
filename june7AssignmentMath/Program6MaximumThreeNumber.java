package june7Assignment;

import java.util.Scanner;

public class Program6MaximumThreeNumber {
	public static void main ( String args []) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("please enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a = Math.max(a, b);
		b = Math.max(b, c);
		
		System.out.println(Math.max(a, b));
		
	}
}
