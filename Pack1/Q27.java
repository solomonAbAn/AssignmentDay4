package Pack1;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//27.	Write a program to display the multiplication table of a given integer. 
//		Test Data :
//			Input the number (Table to be calculated) : 15 
//			Expected Output : 
//			15 X 1 = 15 
//			...
//			... 
//			15 X 10 = 150

		Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated): ");
        int number = scanner.nextInt();

        scanner.close();

        displayMultiplicationTable(number);
    }

    // Function to display the multiplication table of a given integer
    public static void displayMultiplicationTable(int number) {
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
	}

}
