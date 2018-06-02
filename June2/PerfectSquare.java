package June2;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		int square = sc.nextInt();						//120
		double decimalSquare = square;					//120
		double sqrtWithDecimal = Math.sqrt(square);		//10.95
		int sqrtint = (int)sqrtWithDecimal;				//10
		double sqrtWithoutDecimal = sqrtint; 			//10.00
		if(sqrtWithDecimal-sqrtWithoutDecimal == 0) {
			System.out.println("Perfect Square");
		}else {
			System.out.println("Not a Perfect Square");
		}
	}
}
