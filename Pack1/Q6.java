package Pack1;

import java.util.Random;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6.	Write a Java program to find the maximum and minimum value of an array.

		// max
		// min
		// array
		 Random rd = new Random();
	

	        int[] array = new int[rd.nextInt(7) + 3];

	        for (int i = 0; i < array.length; i++) {
	            array[i] = rd.nextInt(100);
	        }
System.out.println("the array is: ");
	        for (int j : array) {
	            System.out.print(j + " ");
	        }

	        int max = Integer.MIN_VALUE; 

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        System.out.println("");
	        System.out.println("");
	        System.out.println("Maximum value: " + max);
	        
	        int min = Integer.MAX_VALUE; 

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }

	        System.out.println("");
	        System.out.println("Minimum value: " + min);
	    }
	}