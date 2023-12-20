package Pack1;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//19.	Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1. 
		
		
		int[] array = {10, 5, 8, 20, 15};

        int difference = findDifference(array);

        System.out.println("The difference between the largest and smallest values in the array is: " + difference);
    }

    
    public static int findDifference(int[] array) {
        if (array.length < 1) {
            System.out.println("Array must have a length of at least 1.");
            return -1; 
        }

        int smallest = array[0];
        int largest = array[0];

       
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        
        return largest - smallest;
	}

}
