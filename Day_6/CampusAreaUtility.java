package Day_6;

import java.util.Scanner;

public class CampusAreaUtility {

    public static void main(String[] args) {

    	// Practical 2: Campus Area Utility
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose Shape: (1- Square, 2- Rectangle, 3- Circle): ");
        int choice = sc.nextInt();

        double side = 0, length = 0, width = 0;
        int radius = 0;

        if (choice == 1) {
            System.out.print("Side: ");
            side = sc.nextDouble();
        } 
        else if (choice == 2) {
            System.out.print("Length: ");
            length = sc.nextDouble();

            System.out.print("Width: ");
            width = sc.nextDouble();
        } 
        else if (choice == 3) {
            System.out.print("Radius: ");
            radius = sc.nextInt();
        }

        System.out.println("AREA RESULT");

        if (choice == 1) {
            System.out.println("Shape: Square");
            System.out.printf("Area: %.2f square units\n", area(side));
        } 
        else if (choice == 2) {
            System.out.println("Shape: Rectangle");
            System.out.printf("Area: %.2f square units\n", area(length, width));
        } 
        else if (choice == 3) {
            System.out.println("Shape: Circle");
            System.out.printf("Area: %.2f square units\n", area(radius));
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int radius) {
        return 3.14 * radius * radius;
    }
}
		