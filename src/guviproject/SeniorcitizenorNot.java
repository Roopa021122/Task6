package guviproject;

import java.util.Scanner;

public class SeniorcitizenorNot {

	public static void main(String[] args) {
		//  Write a program to check whether the person is a senior citizen or not.
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter age to check for senior citizen: ");
	        int age = input.nextInt();
	        if (age >= 60) {
	            System.out.println("The person is a senior citizen.");
	        } else {
	            System.out.println("The person is not a senior citizen.");
	        }



	}

}
