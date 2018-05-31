package may30;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter three number: ");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		if( a>b && a>c ) {
			System.out.println("a is greatest");
		}
		else if ( b>c && b>a) {
			System.out.println("b is greatest");
		}
		else if ( c>a && c>b ) {
			System.out.println("c is greatest");
		}
		

	}

}
