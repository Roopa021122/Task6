package Task7;

import java.util.Scanner;

import guviproject.ArithmaticException;

public class DivisionProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = input.nextInt();
		System.out.println("Enter second Number:");
		int num2 = input.nextInt();
		try {
			int Division = num1 / num2 ;
			System.out.println("Division of 2 integers is:"+ Division);
		}
	catch (ArithmeticException e) {
		 System.out.println("Error: Division by zero is not allowed.");
	}
	
	
	}

}
