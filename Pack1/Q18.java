package Pack1;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//18.	Write a Java program to find the number of even and odd integers in a given array of integers. 
		
		 int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        int evenCount = 0;
	        int oddCount = 0;

	        for (int num : array) {
	            if (num % 2 == 0) {
	                // Increment the even count
	                evenCount++;
	            } else {
	                // Increment the odd count
	                oddCount++;
	            }
	        }

	        System.out.println("Number of even integers: " + evenCount);
	        System.out.println("Number of odd integers: " + oddCount);
	}

}
