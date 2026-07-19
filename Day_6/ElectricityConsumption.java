package Day_6;

import java.util.Scanner;

public class ElectricityConsumption {

    public static void main(String[] args) {
    	
    	//Practical 3: Electricity Consumption Estimator

        Scanner sc = new Scanner(System.in);

        System.out.print("Type (1- Room, 2- Laboratory): ");
        int choice = sc.nextInt();

        System.out.print("Units Consumed: ");
        int units = sc.nextInt();

        double fixedCharge = 0;

        if (choice == 2) {
            System.out.print("Fixed Equipment Charge: ");
            fixedCharge = sc.nextDouble();
        }

        System.out.println("\nELECTRICITY ESTIMATE");

        if (choice == 1) {

            System.out.println("Type: Room");
            System.out.printf("Total Cost: Rs. %.2f\n", calculateBill(units));

        } else if (choice == 2) {

            System.out.println("Type: Laboratory");
            System.out.printf("Energy Charge: Rs. %.2f\n", units * 6.0);
            System.out.printf("Equipment Charge: Rs. %.2f\n", fixedCharge);
            System.out.printf("Total Cost: Rs. %.2f\n", calculateBill(units, fixedCharge));

        } else {

            System.out.println("Invalid Type.");

        }

        sc.close();
    }

  
    public static double calculateBill(int units) {
        return units * 6.0;
    }

 
    public static double calculateBill(int units, double equipmentCharge) {
        return (units * 6.0) + equipmentCharge;
    }
}

