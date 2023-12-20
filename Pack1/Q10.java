package Pack1;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//10.	Write a Java program to find common elements between two arrays (string values). 

		String[] array1 = { "apple", "banana", "orange", "grape", "kiwi" };
		String[] array2 = { "banana", "orange", "kiwi", "melon", "strawberry" };

		System.out.println("array1: ");
		for (String j : array1) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("array2: ");
		for (String i : array2) {
			System.out.println(i);
		}

		System.out.println("");
		System.out.println("Common elements between the two arrays:");

		for (String value1 : array1) {

			for (String value2 : array2) {
				if (value1.equals(value2)) {
					System.out.println(value1);
					break;
				}
			}
		}
	}
}
