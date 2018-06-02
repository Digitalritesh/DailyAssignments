package June2;

import java.util.Scanner;

public class OuncePoundConvertor {
	
	public static double convertToPound(double ounce) {
		return ounce/16;
	}
	
	public static double convertToOunce(double pound) {
		return pound*16;
	}
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		double ouncesEntered = sc.nextDouble();
		System.out.println("Ounces provided: "+ouncesEntered);
		double poundsConverted = Math.round(convertToPound(ouncesEntered) * 100D)/100D;
		System.out.println("pound converted: "+poundsConverted);
		double ouncesCouverted = convertToOunce(poundsConverted);
		System.out.println("Ounces converted: "+ouncesCouverted);
		
	}
}
