package Task5;

import java.util.Scanner;

public class HotelTarrif {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the month (1-12):");
	        int month = scanner.nextInt();
	        System.out.println("Enter the room rent per day:");
	        float roomRent = scanner.nextFloat();
	        System.out.println("Enter the number of days stayed:");
	        int days = scanner.nextInt();
	        double totalRent =roomRent * days; 
switch (month) {
case 4: case 5: case 6:  // April, May, June
case 11: case 12:        // November, December
    totalRent *= 1.2; // Increase rent by 20%
    System.out.println("Peak season: Rent increased by 20%");
    break;
default:
    System.out.println("Non-peak season: No extra charge.");
    break;
}
System.out.println("Total room rent: " + totalRent);
scanner.close();
}
}

		

	


