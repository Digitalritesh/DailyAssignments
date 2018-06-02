package June2;

import java.util.Scanner;

public class Factorial {
	
	public static long getFactorialOf(long number){
		if(number <= 0) {
			return 1;
		}else {
			return (number * getFactorialOf(number-1));
		}
	}
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		System.out.println("Factorial is: "+ getFactorialOf(number));
	}
}
