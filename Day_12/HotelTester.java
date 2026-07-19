package Day_12;

import java.util.Scanner;

//Practical 2: Hotel Room Booking Object

class Room {
    int roomNumber;
    String roomType;
    double dailyRate;
    boolean isAvailable;

    Room(int roomNumber, String roomType, double dailyRate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }

    void bookRoom(int days) {
        if (isAvailable) {
            isAvailable = false;

            double totalAmount = dailyRate * days;

            System.out.println("\nBOOKING DETAILS");
            System.out.println("Room: " + roomNumber + " - " + roomType);
            System.out.println("Days: " + days);
            System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
            System.out.println("Status: Booked");
        } else {
            System.out.println("Room already occupied.");
        }
    }
}

public class HotelTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Room type: ");
        String roomType = sc.nextLine();

        System.out.print("Daily rate: ");
        double dailyRate = sc.nextDouble();

        System.out.print("Stay days: ");
        int days = sc.nextInt();

        Room r = new Room(roomNumber, roomType, dailyRate);
        r.bookRoom(days);

        sc.close();
    }
}