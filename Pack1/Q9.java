package Pack1;



public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//9.	Write a Java program to find duplicate values in an array of string values. 
		
		String[] array = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

        System.out.println("Duplicate values in the array:");

       
        for (int i = 0; i < array.length - 1; i++) {
            
            for (int j = i + 1; j < array.length; j++) {
              
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    break; 
                }
            }
        }
    }
}

