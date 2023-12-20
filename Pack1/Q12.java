package Pack1;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//12.	Write a Java program to remove duplicate elements from an array. 
		
		
		
		
		
		 int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 4, 9};

	        System.out.println("Original array:");
	        printArray(array);

	        // Remove duplicates
	        int[] uniqueArray = removeDuplicates(array);

	        System.out.println("\nArray after removing duplicates:");
	        printArray(uniqueArray);
	    }

	    // Function to remove duplicates from an integer array
	    public static int[] removeDuplicates(int[] array) {
	        int n = array.length;

	        // Count the number of unique elements
	        int uniqueCount = 0;
	        for (int i = 0; i < n; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++) {
	                if (array[i] == array[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                uniqueCount++;
	            }
	        }

	        // Create a new array to store unique elements
	        int[] uniqueArray = new int[uniqueCount];
	        int index = 0;

	        // Copy unique elements to the new array
	        for (int i = 0; i < n; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < i; j++) {
	                if (array[i] == array[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                uniqueArray[index++] = array[i];
	            }
	        }

	        return uniqueArray;
	    }

	    // Function to print an array
	    public static void printArray(int[] array) {
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	}

}
