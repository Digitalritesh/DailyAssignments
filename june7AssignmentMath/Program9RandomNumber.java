package june7Assignment;

public class Program9RandomNumber {
	public static void randomNumber () {
		double a = Math.random();
		a = a*1000;
		System.out.println((int) a);
	}
	public static void main ( String args []){
		randomNumber();
	}
}
