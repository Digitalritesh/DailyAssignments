package may31;

public class ArrayAdd {
	
	public static void main(String a[]) {
		int array1[] = new int[4];
		 array1[0] = 1;
		 array1[1] = 2;
		 array1[2] = 11;
		 array1[3] = 23;
		 
		 int array2[] = new int[4];
		 array2[0] = 2;
		 array2[1] = 19;
		 array2[2] = 11;
		 array2[3] = 16;
		 
		 int array3[] = new int[4];
		 
		 for(int i = 0; i < array1.length; i++) {
			 array3[i] = array1[i]+array2[i];
		 }
		 
		 for(int i = 0; i < array1.length; i++) {			 
			 System.out.print(array3[i]+" ");
		 }
		 
	}

}
