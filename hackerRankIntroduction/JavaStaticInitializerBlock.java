package hackerRankIntroduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	 static {
	     Scanner sc = new Scanner ( System.in);
		     byte b = sc.nextByte();
		     byte h = sc.nextByte();
	     if ( h > 0 && b > 0 ){
	         System.out.println(b*h);
	     }
	     else{
	         System.out.println("java.lang.Exception: Breadth and height must be positive");
	     }
	 }

	public static void main(String[] args) {
	}

}
