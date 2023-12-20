package Pack1;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//14.	Write a Java program to find the second smallest element in an array. 
		
		
		 int[] array = {10, 5, 8, 20, 15};

	        int secondSmallest = findSecondSmallest(array);

	        if (secondSmallest != Integer.MAX_VALUE) {
	            System.out.println("The second smallest element in the array is: " + secondSmallest);
	        } else {
	            System.out.println("Array does not have a second smallest element.");
	        }
	    }

	    // Function to find the second smallest element in an array
	    public static int findSecondSmallest(int[] array) {
	        int n = array.length;

	        if (n < 2) {
	            // Array should have at least two elements to have a second smallest
	            return Integer.MAX_VALUE;
	        }

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        // Find the smallest element in the array
	        for (int i = 0; i < n; i++) {
	            if (array[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = array[i];
	            } else if (array[i] < secondSmallest && array[i] != smallest) {
	                secondSmallest = array[i];
	            }
	        }

	        return secondSmallest;
	}

}
