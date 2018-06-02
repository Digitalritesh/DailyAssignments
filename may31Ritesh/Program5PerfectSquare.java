package may31;

import java.util.Scanner;

public class Program5PerfectSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int a = in.nextInt();
		// can get solution
		for(int b=2; b<a ; b++) {
			if(a==b*b) {
				System.out.println(a+" number is not perfect square");
				break;
			}
			else {
				System.out.println(a+" number is  perfect square");
				break;
			}
		}

	}

}
