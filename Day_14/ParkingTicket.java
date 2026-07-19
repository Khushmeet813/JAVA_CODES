package Day_14;

import java.util.Scanner;

//Practical 2: University Parking Ticket System

class Vehicle {
    String vehicleNumber;
    int type; 

    Vehicle(String vehicleNumber, int type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }
}

class Ticket {
    Vehicle vehicle;
    int hours;
    int fee;

    Ticket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
        this.fee = calculateFee();
    }

    int calculateFee() {
        if (vehicle.type == 1) {
            return 10 + (hours - 1) * 5;
        } else {
            return 20 + (hours - 1) * 10;
        }
    }

    void printTicket(int index) {
        String vehicleType;

        if (vehicle.type == 1) {
            vehicleType = "Two-wheeler";
        } else {
            vehicleType = "Car";
        }

        System.out.println("\nTICKET " + index);
        System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Hours: " + hours);
        System.out.println("Fee: Rs. " + fee);
    }
}

public class ParkingTicket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of vehicles: ");
        int n = sc.nextInt();

        Ticket[] tickets = new Ticket[n];
        int totalRevenue = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nVehicle " + (i + 1));

            System.out.print("Vehicle Number: ");
            String number = sc.next();

            System.out.print("Vehicle Type (1 -Two-wheeler, 2 - Car): ");
            int type = sc.nextInt();

            System.out.print("Hours Parked: ");
            int hours = sc.nextInt();

            Vehicle vehicle = new Vehicle(number, type);
            tickets[i] = new Ticket(vehicle, hours);

            totalRevenue += tickets[i].fee;
        }

        System.out.println("\nPARKING TICKETS");

        for (int i = 0; i < n; i++) {
            tickets[i].printTicket(i + 1);
        }

        System.out.println("\nTotal Revenue: Rs. " + totalRevenue);

        sc.close();
    }
}