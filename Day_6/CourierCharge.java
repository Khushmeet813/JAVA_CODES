package Day_6;

import java.util.Scanner;

public class CourierCharge {

    public static void main(String[] args) {
    	
    	// Practical 1: Courier Charge Calculator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Delivery Type (1- Local, 2- Outstation): ");
        int choice = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        double distance = 0;

        
        if (choice == 2) {
            System.out.print("Enter Distance (km): ");
            distance = sc.nextDouble();
        }

        System.out.println("\nCOURIER CHARGE");

        if (choice == 1) {

            System.out.println("Delivery: Local");
            System.out.printf("Charge: Rs. %.2f\n", calculateCharge(weight));

        } else if (choice == 2) {

            System.out.println("Delivery: Outstation");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Distance: " + distance + " km");
            System.out.printf("Charge: Rs. %.2f\n", calculateCharge(weight, distance));

        } else {

            System.out.println("Invalid Delivery Type.");

        }

        sc.close();
    }

    
    public static double calculateCharge(double weight) {
        return weight * 50;
    }

    public static double calculateCharge(double weight, double distance) {
        return (weight * 50) + distance;
    }
}
		
		
		
 
