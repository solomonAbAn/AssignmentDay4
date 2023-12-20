package Pack1;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//23.	Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.   
		
		int[] array = {-5, 2, -8, 3, -1, 7, -4};

        arrangeNegativePositive(array);

        System.out.println("Array after arranging negative and positive integers:");
        printArray(array);
    }

    // Function to arrange negative integers before positive integers
    public static void arrangeNegativePositive(int[] array) {
        int n = array.length;

        // Initialize two pointers: one for negative integers and one for positive integers
        int negPointer = 0;
        int posPointer = 0;

        while (negPointer < n && posPointer < n) {
            // Find the first negative integer
            while (negPointer < n && array[negPointer] >= 0) {
                negPointer++;
            }

            // Find the first positive integer
            while (posPointer < n && array[posPointer] < 0) {
                posPointer++;
            }

            // Swap the negative and positive integers
            if (negPointer < n && posPointer < n) {
                int temp = array[negPointer];
                array[negPointer] = array[posPointer];
                array[posPointer] = temp;
            }
        }
    }

    // Function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
	}

}
