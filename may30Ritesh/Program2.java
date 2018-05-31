package may30;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter three numbers a,b and c respectively");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		if(a<b && a<c) {
			System.out.println("A is smallest");
		}
		else if(b<c && b<a) {
			System.out.println("B is smallest");
		}
		else {
			System.out.println("C is smallest");
		}
		

	}

}
