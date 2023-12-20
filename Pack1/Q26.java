package Pack1;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//26.	Write a program to accept a grade and declare the equivalent description :  
//		Grade	Description
//		E	Excellent
//		V	Very Good 
//		G	Good
//		A	Average
//		F	Fail
//		Test Data : 
//		Input the grade :a
//		Expected Output :
//		You have chosen : Average
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input the grade: ");
        char grade = scanner.next().toUpperCase().charAt(0);

        scanner.close();

        String description = getGradeDescription(grade);

        System.out.println("You have chosen: " + description);
    }

    // Function to get the description for a given grade
    public static String getGradeDescription(char grade) {
        switch (grade) {
            case 'E':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good";
            case 'A':
                return "Average";
            case 'F':
                return "Fail";
            default:
                return "Invalid Grade";
        }

	}

}
