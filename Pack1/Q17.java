package Pack1;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//17.	Write a Java program to find a missing number in an array. 
		
		
		
		
		 int[] array = {1, 2, 4, 6, 3, 7, 8};

	        int missingNumber = findMissingNumber(array, 8);

	        System.out.println("The missing number in the array is: " + missingNumber);
	    }

	    // Function to find the missing number in an array
	    public static int findMissingNumber(int[] array, int n) {
	        // Calculate the sum of the first n natural numbers
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the actual sum of the elements in the array
	        int actualSum = 0;
	        for (int num : array) {
	            actualSum += num;
	        }

	        // The missing number is the difference between the expected and actual sums
	        return expectedSum - actualSum;
	}

}
