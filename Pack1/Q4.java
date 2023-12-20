package Pack1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3.	Write a Java program to remove a specific element from an array. 
		
		  System.out.println("This is the original array: ");
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }

	        System.out.println("\nThe index to be removed is 5");

	        
	        int[] newArray = removeElement(array, 4);

	        System.out.println("Array after removing element at index 5: ");
	        for (int i = 0; i < newArray.length; i++) {
	            System.out.print(newArray[i] + " ");
	        }
	    }

	    private static int[] removeElement(int[] array, int indexToRemove) {
	        if (indexToRemove < 0 || indexToRemove >= array.length) {
	            
	            return array;
	        }

	        int[] newArray = new int[array.length - 1];
	        int newIndex = 0;

	        for (int i = 0; i < array.length; i++) {
	            if (i != indexToRemove) {
	                newArray[newIndex++] = array[i];
	            }
	        }

	        return newArray;
	    }
	}