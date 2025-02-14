package guviproject;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// Write a program to check if a number is prime or not.
		 Scanner input = new Scanner(System.in);

			System.out.println("enter first number");
			 int number = input.nextInt();
			 boolean isPrime = true;
		        if (number <= 1) {    //because 1 and 0 is not a prime 
		            isPrime = false;
		        } else {
		            for (int i = 2; i * i <= number; i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }
		        System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
	}
}


