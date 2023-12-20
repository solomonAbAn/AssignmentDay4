package Pack1;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//16.	Write a Java program to test two arrays' equality. 
		
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};

        // Test equality between array1 and array2
        if (areArraysEqual(array1, array2)) {
            System.out.println("array1 and array2 are equal.");
        } else {
            System.out.println("array1 and array2 are not equal.");
        }

        // Test equality between array1 and array3
        if (areArraysEqual(array1, array3)) {
            System.out.println("array1 and array3 are equal.");
        } else {
            System.out.println("array1 and array3 are not equal.");
        }
    }

    // Function to test equality between two arrays
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // Check if arrays have the same length
        if (array1.length != array2.length) {
            return false;
        }

        // Check if corresponding elements are equal
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
	}

}
