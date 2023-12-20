package Pack1;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//4.	Write a Java program to copy an array by iterating the array. 
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("this is the array: " );
		
		int i;
		for (i=0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("");
		System.out.println("this is the copied array: ");
		
		
		int j;
		int [] arrayCopied = array;
		for (j=0; j < array.length; j++) {
			System.out.print(arrayCopied[j] + "  ");
		
		}
		
		
		
		
		
		
		
	}

}
