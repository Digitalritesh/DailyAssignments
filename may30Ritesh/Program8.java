package may30;

import java.util.Scanner;

public class Program8 {
	static void swapNumber() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter two number");
		
		int a=in.nextInt();
		int b=in.nextInt();
		
		System.out.println("the number entered by you are: "+a+"\t"+b);
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("the number after swapping are: "+a+"\t"+b);
	}
	public static void main(String []args) {
		swapNumber();
	}

}
