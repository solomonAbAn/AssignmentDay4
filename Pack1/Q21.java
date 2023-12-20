package Pack1;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//21.	Write a Java program to check if an array of integers is without 0 and -1. 
		
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {0, 2, -1, 4, 5};

        if (containsOnlyValidElements(array1)) {
            System.out.println("Array1 does not contain 0 or -1.");
        } else {
            System.out.println("Array1 contains 0 or -1.");
        }

        if (containsOnlyValidElements(array2)) {
            System.out.println("Array2 does not contain 0 or -1.");
        } else {
            System.out.println("Array2 contains 0 or -1.");
        }
    }

    // Function to check if an array contains only valid elements (other than 0 and -1)
    public static boolean containsOnlyValidElements(int[] array) {
        for (int num : array) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
	}

}
