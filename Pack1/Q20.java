package Pack1;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//20.	Write a Java program to compute the average value of an array of integers except the largest and smallest values. 
		
		 int[] array = {10, 5, 8, 20, 15};

	        if (array.length < 3) {
	            System.out.println("Array must have a length of at least 3 to compute the average excluding extremes.");
	        } else {
	            int smallest = array[0];
	            int largest = array[0];
	            int sum = array[0];

	            // Find the smallest and largest values in the array and calculate the sum
	            for (int i = 1; i < array.length; i++) {
	                int num = array[i];
	                sum += num;

	                if (num < smallest) {
	                    smallest = num;
	                }
	                if (num > largest) {
	                    largest = num;
	                }
	            }

	            // Subtract the smallest and largest values from the sum and calculate the average
	            sum -= smallest;
	            sum -= largest;

	            double average = (double) sum / (array.length - 2);

	            System.out.println("The average value of the array (excluding the largest and smallest values) is: " + average);
	        }
	}

}
