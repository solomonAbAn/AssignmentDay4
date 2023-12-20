package Pack1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5.	Write a Java program to insert an element (specific position) into an array. 
		
		
		
		 System.out.println("This is the original array: ");
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }

	        System.out.println("The index to insert the element is 5");

	        int[] newArray = insertElement(array, 10, 9);

	        System.out.println("Array after inserting element at index 5: ");
	        for (int i = 0; i < newArray.length; i++) {
	            System.out.print(newArray[i] + " ");
	        }
	    }

	    private static int[] insertElement(int[] array, int elementToInsert, int indexToInsert) {
	        if (indexToInsert < 0 || indexToInsert > array.length) {
	            // Invalid index, return the original array
	            return array;
	        }

	        int[] newArray = new int[array.length + 1];
	        int newIndex = 0;

	        for (int i = 0; i < newArray.length; i++) {
	            if (i == indexToInsert) {
	                newArray[i] = elementToInsert;
	            } else {
	                if (newIndex < array.length) {
	                    newArray[i] = array[newIndex++];
	                }
	            }
	        }

	        return newArray;
	    }
	}