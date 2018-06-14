package june7Assignment;

import java.util.Scanner;

public class Program5MinimumThreeNumber {
	public static void main ( String args[]) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("please insert three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = Math.min(a, b);
		int e = Math.min(b, c);
		
		System.out.println(Math.min(d, e));
		
	}
}
