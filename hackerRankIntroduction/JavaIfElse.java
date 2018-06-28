package hackerRankIntroduction;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		System.out.println("Please enter a number");
		int n = in.nextInt();
		
		if ( n % 2 == 0 ) {
			if ( n>1 && n<=5 ) {
				System.out.println("Not Weird");
			}
			else if (  n>5 && n<21 ) {
				System.out.println("Weird");
			}
			else if( n>21 ) {
				System.out.println("Not Weird");
			}
		}
		else 
			System.out.println("Weird");
		
		/*if ( n % 2 != 0 ) {
			System.out.println("Weird");
		}
		else if ( n>1 && n<=5 ) {
			System.out.println("Not Weird");
		}
		else if( n>5 && n<21 ) {
			System.out.println("Weird");
		}
		else if( n>21 ) {
			System.out.println("Not Weird");
		}*/
		

	}

}
