package Pack1;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of lines: ");
	        int lines = scanner.nextInt();

	        System.out.println("Pattern a:");
	        printPatternA(lines);

	        System.out.println("\nPattern b:");
	        printPatternB(lines);

	        System.out.println("\nPattern c:");
	        printPatternC(lines);

	        System.out.println("\nPattern d:");
	        printPatternD(lines);

	        System.out.println("\nPattern e:");
	        printPatternE(lines);

	        System.out.println("\nPattern f:");
	        printPatternF(lines);

	        System.out.println("\nPattern h:");
	        printPatternH(lines);

	        scanner.close();
	    }

	    // Function to print Pattern a
	    public static void printPatternA(int lines) {
	        for (int i = 1; i <= lines; i++) {
	            for (int j = i; j <= i + lines - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern b
	    public static void printPatternB(int lines) {
	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern c
	    public static void printPatternC(int lines) {
	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = lines; k >= i; k--) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern d
	    public static void printPatternD(int lines) {
	        for (int i = 1; i <= lines; i++) {
	            for (int j = lines; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = lines - 1; i >= 1; i--) {
	            for (int j = lines; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern e
	    public static void printPatternE(int lines) {
	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = lines; k >= i; k--) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= lines; i++) {
	            for (int j = lines; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern f
	    public static void printPatternF(int lines) {
	        int count = 1;
	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(count++ + " ");
	            }
	            System.out.println();
	        }
	    }

	    // Function to print Pattern h
	    public static void printPatternH(int lines) {
	        for (int i = 1; i <= lines; i += 2) {
	            int spaces = (lines - i) / 2;
	            for (int j = 0; j < spaces; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = lines - 2; i >= 1; i -= 2) {
	            int spaces = (lines - i) / 2;
	            for (int j = 0; j < spaces; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
