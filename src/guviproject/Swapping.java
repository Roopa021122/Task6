package guviproject;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
		//You can make use of additional variable for swapping
// Print the corresponding swapped values of the two numbers as output in the console.
	 Scanner input = new Scanner(System.in);

		System.out.println("enter first number");
		 int a = input.nextInt();

		System.out.println("enter second number");
		int b = input.nextInt();
		int dummy=a;
		 a=b;
         b=dummy;
		System.out.println("After Swapping");
		System.out.println("First number is"+a);
		System.out.println("Second number is"+b);
		


	}

}
