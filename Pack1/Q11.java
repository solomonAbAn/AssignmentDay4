package Pack1;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//11.	Write a Java program to find common elements between two integer arrays. 
		
		 int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {3, 4, 5, 6, 7};

	        System.out.println("Common elements between the two arrays:");

	  
	        for (int value1 : array1) {
	            
	            for (int value2 : array2) {
	                if (value1 == value2) {
	                    System.out.println(value1);
	                    break; 
	                }
	            }
	        }
	}

}
