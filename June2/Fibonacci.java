package June2;

import java.util.Scanner;

public class Fibonacci {
	public static int getFibonacciOf(int number){
		if(number < 1) {
			return -1;
		}
		if(number == 1 || number == 2) {
			return 1;
		}else {
			return getFibonacciOf(number-1)+getFibonacciOf(number-2);
		}
	}
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Fibonacci is: "+ getFibonacciOf(number));
	}
}
