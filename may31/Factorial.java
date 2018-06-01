package may31;

import java.util.Scanner;

public class Factorial {
	public static void main(String a[]) {
		Scanner sc  = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println(factorialOf(number));
	}
	
	public static long factorialOf(long number) {
		long factorial = 1;
		if(number < 0) {
			return number;
		}else if(number == 0) {
			return factorial;
		}
		else {
			for(long i = number; i > 0; i--) {
				//recursion
				factorial = factorial * i;
			}
			/*
			 * 
			 * 1 * 3 * 2 * 1
			 * 6
			 * 
			 * 
			 * */
		}
		return factorial;
	}
}
