package Pack1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.	Write a Java program to find the index of an array element. 
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("give me an index and I will give you its associated number in the array: ");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		if(num>9 || num<0) {
			System.out.println("your index doesn't have any associated number with it");
			System.exit(0);
		}
		
		System.out.println("the index you gave is associated with the number: " + array[num]);
		
		
		kb.close();
		

}
}
