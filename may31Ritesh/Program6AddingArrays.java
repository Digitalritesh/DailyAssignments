package may31;

public class Program6AddingArrays {

	public static void main(String[] args) {
		int array1[]= new int[4];
		int array2[]= new int[4];
		
		array1[0]=10;
		array1[1]=11;
		array1[2]=12;
		array1[3]=11;
		
		array2[0]=22;
		array2[1]=42;
		array2[2]=0;
		array2[3]=0;
		
		// is it okay to add array2[2] and array[3]
		int array3[]= new int[4];
		
		for(int i = 0; i < array1.length; i++) {
			array3[i]= array1[i] + array2[i];
			System.out.println(array3[i]+"\t");
		}

	}

}
