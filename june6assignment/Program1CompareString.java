package june6;

public class Program1CompareString {
	public static void main (String args []	) {
		String a = "developer";
		String b = "Developer";
		String c = "App developer";
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(b.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(c));
	}
}
