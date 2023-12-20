package Pack1;

import java.util.Arrays;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//24.	Write a Java program to sort an array of positive integers from an array. 
		//In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, 
		//the fourth should be the second minimum and so on.   
		int[] array = {5, 2, 9, 1, 7, 4, 8, 3};

        sortAlternateMinMax(array);

        System.out.println("Sorted array with alternate min-max arrangement:");
        printArray(array);
    }

    // Function to sort the array with alternate min-max arrangement
    public static void sortAlternateMinMax(int[] array) {
        Arrays.sort(array);

        int n = array.length;
        int[] result = new int[n];

        int minPointer = 0;
        int maxPointer = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = array[maxPointer];
                maxPointer--;
            } else {
                result[i] = array[minPointer];
                minPointer++;
            }
        }

        // Copy the result back to the original array
        System.arraycopy(result, 0, array, 0, n);
    }

    // Function to print an array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
	}

}
