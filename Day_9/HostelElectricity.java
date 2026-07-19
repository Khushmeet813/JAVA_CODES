package Day_9;

import java.util.Scanner;

public class HostelElectricity {

    public static void main(String[] args) {
    	
    	//Practical 2: Hostel Electricity Matrix

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[4][7];
        int totalHostelConsumption = 0;

        System.out.println("Enter units for 4 rooms over 7 days:");

        for (int r = 0; r < 4; r++) {
            for (int d = 0; d < 7; d++) {
                matrix[r][d] = sc.nextInt();
            }
        }

        System.out.println("\nHOSTEL ELECTRICITY REPORT");

        for (int r = 0; r < 4; r++) {

            int roomTotal = 0;

            for (int d = 0; d < 7; d++) {
                roomTotal += matrix[r][d];
            }

            totalHostelConsumption += roomTotal;

            System.out.println("Room " + (r + 1) + " Weekly Units: " + roomTotal);
        }

        System.out.println("Total Hostel Consumption: " + totalHostelConsumption + " units");

        sc.close();
    }
}