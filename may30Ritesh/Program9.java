package may30;

import java.util.Scanner;

public class Program9 {
	
	static void SwapWithoutThirdNumber() {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter two number: ");
		int a=in.nextInt();
		int b=in.nextInt();
		
		System.out.println("number you entered are: "+a+"\t"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("the value after swapping is: "+a+"\t"+b);
	}
	public static void main(String[] args) {
		SwapWithoutThirdNumber();
	}

}
