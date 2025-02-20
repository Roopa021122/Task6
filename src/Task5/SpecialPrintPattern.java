package Task5;

import java.util.Scanner;

public class SpecialPrintPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Enter a number: ");
	     
		int n = scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            if (i == n / 2) {
	                System.out.println("*");
	            } else {
	                System.out.println("**");
	            }
	        scanner.close();
	        }
	        
}
}