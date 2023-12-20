package Pack1;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//13.	Write a Java program to find the second largest element in an array. 
		
		
		 int[] array = {10, 5, 8, 20, 15};

	        int secondLargest = findSecondLargest(array);

	        if (secondLargest != Integer.MIN_VALUE) {
	            System.out.println("The second largest element in the array is: " + secondLargest);
	        } else {
	            System.out.println("Array does not have a second largest element.");
	        }
	    }

	    // Function to find the second largest element in an array
	    public static int findSecondLargest(int[] array) {
	        int n = array.length;

	        if (n < 2) {
	            // Array should have at least two elements to have a second largest
	            return Integer.MIN_VALUE;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Find the largest element in the array
	        for (int i = 0; i < n; i++) {
	            if (array[i] > largest) {
	                secondLargest = largest;
	                largest = array[i];
	            } else if (array[i] > secondLargest && array[i] != largest) {
	                secondLargest = array[i];
	            }
	        }

	        return secondLargest;
	}

}
