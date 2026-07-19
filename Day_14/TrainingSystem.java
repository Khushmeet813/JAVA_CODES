package Day_14;

import java.util.Scanner;

//Practical 3: Training Centre Fee and Attendance System

class Learner {
    String id;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance = new int[7];

    Learner(String id, String name, double fee, double paid, int[] att) {
        this.id = id;
        this.name = name;
        this.courseFee = fee;
        this.amountPaid = paid;

        for (int i = 0; i < 7; i++) {
            attendance[i] = att[i];
        }
    }

    double calculatePendingFee() {
        return courseFee - amountPaid;
    }

    double calculateAttendancePercentage() {
        int present = 0;

        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1) {
                present++;
            }
        }

        return (present / 7.0) * 100;
    }

    String isCertificateEligible() {
        if (calculatePendingFee() > 0) {
            return "Not Eligible (Fee Pending)";
        } else if (calculateAttendancePercentage() < 75) {
            return "Not Eligible (Low Attendance)";
        } else {
            return "Eligible";
        }
    }

    void generateReport() {
        System.out.println("\nLEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Pending Fee: Rs. %.2f%n", calculatePendingFee());
        System.out.printf("Attendance: %.2f%%%n", calculateAttendancePercentage());
        System.out.println("Certificate Eligibility: " + isCertificateEligible());
    }
}

public class TrainingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Learner ID: ");
        String id = sc.next();

        System.out.print("Learner Name: ");
        String name = sc.next();

        System.out.print("Course Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Amount Paid: ");
        double paid = sc.nextDouble();

        int[] attendance = new int[7];

        System.out.println("Enter attendance for 7 sessions (1 = Present, 0 = Absent):");

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
        }

        Learner learner = new Learner(id, name, fee, paid, attendance);

        learner.generateReport();

        sc.close();
    }
}