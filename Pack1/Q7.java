package Pack1;

import java.util.Random;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7.	Write a Java program to reverse an array of integer values. 
		
		Random rd = new Random();
		int[] array = new int[rd.nextInt(7) + 3];
		System.out.println("the array: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = rd.nextInt(99);
		}
		for(int j : array) {
			System.out.print(j + " ");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("reverse array: ");
		for(int k = 0; k<array.length; k++) {
			array[k] = array[array.length - 1 - k];
			System.out.print(array[k] + " ");
		}
		
		
		
		
		
		
		
		
		
	}

}
