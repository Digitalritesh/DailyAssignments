package may31;

import java.util.Scanner;

public class Program3factorsOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a number whose factor you want: ");
		int a = in.nextInt();
		
		System.out.println("the factors of "+a+" are:");
		for(int b=1; b<=a ; b++) {
			if(a%b==0) {
			System.out.println(b);
			}
		}

	}

}
