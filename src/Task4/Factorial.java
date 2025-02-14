package Task4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Write a program to print the factorial of a given number.
		 Scanner input = new Scanner(System.in);

			System.out.println("enter factorial number");
			 int factNum = input.nextInt();
			 long factorial = 1;  // Use long to handle larger factorials

			 if (factNum < 0) {
		            System.out.println("Factorial cannot be calculated for negative numbers.");
		        } else {
		            for (int i = 1; i <= factNum; i++) {
		                factorial *= i;
		            }
		            System.out.println("Factorial of " + factNum + " is: " + factorial);
		        }



	}

}
