package Task5;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("\nEnter three numbers:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();

	        int largest = num1;
	        if (num2 > largest) {
	            largest = num2;
	        }
	        if (num3 > largest) {
	            largest = num3;
	        }
	        System.out.println("Largest number: " + largest);
            scanner.close(); 
	    }
}
	


