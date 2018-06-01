package may31;

import java.beans.IntrospectionException;
import java.util.Scanner;

public class SimpleInterest {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt();
		int rate = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("Interest is: "+calculateSimpleInterest(month, rate, principle));
	}
	
	public static double calculateSimpleInterest(int month, int rate, int principle){
		double interest = 0;
		interest = ((double)(principle * rate * month))/1200;
		return interest;
	}
}
