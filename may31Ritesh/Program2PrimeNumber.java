package may31;

import java.util.Scanner;

public class Program2PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		int a = in.nextInt();
		
		for(int b=2; b<a; b++) {
			if(a%b==0) {
				System.out.println(a+" Number is not Prime Number");
				break;
			}
			else{
				System.out.println(a+" Number is a prime number");
				break;
			}
		}

	}

}
