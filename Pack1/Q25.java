package Pack1;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//25.	Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.  
//		Test Data : 
//			Input the number of terms : 5 
//			Expected Output :
//			1 + 11 + 111 + 1111 + 11111 + 
//			The Sum is : 12345

			
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int n = scanner.nextInt();

        scanner.close();

        int sum = calculateSeriesSum(n);

        System.out.println("The Sum is: " + sum);
    }

    // Function to calculate the sum of the series 1 + 11 + 111 + 1111 + ... up to n terms
    public static int calculateSeriesSum(int n) {
        int sum = 0;
        int term = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(term);

            if (i < n) {
                System.out.print(" + ");
            }

            sum += term;
            term = term * 10 + 1;
        }

        System.out.println();
        return sum;
		
		
	}

}
