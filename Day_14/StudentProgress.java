package Day_14;

import java.util.Scanner;

//Practical 1: College Student Progress Manager

class HackathonStudent {
    int rollNumber;
    String name;
    int[] marks = new int[5];
    int attendance;

    HackathonStudent(int roll, String name, int[] marks, int attendance) {
        this.rollNumber = roll;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }

        this.attendance = attendance;
    }

    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    String getResult() {
        if (calculateAverage() >= 40)
            return "PASS";
        else
            return "FAIL";
    }

    String getAttendanceStatus() {
        if (attendance >= 75)
            return "Satisfactory";
        else
            return "Shortage";
    }

    void displayRow() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.printf("Average: %.2f%n", calculateAverage());
        System.out.println("Result: " + getResult());
        System.out.println("Attendance: " + getAttendanceStatus());
        System.out.println();
    }
}

public class StudentProgress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int count = sc.nextInt();

        HackathonStudent[] classRecords = new HackathonStudent[count];

        for (int i = 0; i < count; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            System.out.println("Enter 5 Marks:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance (%): ");
            int attendance = sc.nextInt();

            classRecords[i] = new HackathonStudent(roll, name, marks, attendance);
        }

        System.out.println("\nCLASS REPORT");

        for (HackathonStudent student : classRecords) {
            student.displayRow();
        }

        sc.close();
    }
}