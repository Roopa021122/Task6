package guviproject;

import java.util.Scanner;

public class Countnumberofdigits {

	public static void main(String[] args) {
		//  Write a program to Count Number of Digits in an Integer.
		Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int digitCount = 0;

        // Handle negative numbers:  Count digits of the absolute value
        if (number < 0) {
            number = Math.abs(number); // Make it positive
        }

        // Handle zero separately:  Zero has one digit.
        if (number == 0) {
            digitCount = 1;
        } else {
            // Efficiently count digits using division
            while (number > 0) {
                number /= 10;  // Integer division removes the last digit
                digitCount++;
            }
        }



        System.out.println("Number of digits: " + digitCount);

        input.close(); // Close the scanner to release resources
    }
}
	


