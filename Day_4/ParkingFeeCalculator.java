package Day_4;

import java.util.Scanner;

public class ParkingFeeCalculator {

    public static void main(String[] args) {
    	
    	// Practical 1: University Parking Fee Calculator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Type (1-Two Wheeler, 2-Car): ");
        int type = sc.nextInt();

        System.out.print("Enter Hours (1-12): ");
        int hours = sc.nextInt();

        
        if (hours < 1 || hours > 12) {
            System.out.println("Invalid Hours! Enter hours between 1 and 12.");
        }
        else if (type == 1) {
            int fee = 10 + (hours - 1) * 5;
            System.out.println("Vehicle: Two-Wheeler");
            System.out.println("Hours: " + hours);
            System.out.println("Parking Fee: Rs. " + fee);
        }
        else if (type == 2) {
            int fee = 20 + (hours - 1) * 10;
            System.out.println("Vehicle: Car");
            System.out.println("Hours: " + hours);
            System.out.println("Parking Fee: Rs. " + fee);
        }
        else {
            System.out.println("Invalid Vehicle Type!");
        }

        sc.close();
    }
}

	