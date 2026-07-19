package Day_12;

import java.util.Scanner;

class Enrollment {
    String enrollmentID;
    String learnerName;
    String courseName;
    double fee;
    String paymentStatus;


    Enrollment(String id, String name, String course, double fee) {
        this(id, name, course, fee, "Pending");
    }

   
    Enrollment(String id, String name, String course, double fee, String status) {
        enrollmentID = id;
        learnerName = name;
        courseName = course;
        this.fee = fee;
        paymentStatus = status;
    }

    void displaySummary() {
        System.out.println("\nENROLLMENT RECORD");
        System.out.println("ID: " + enrollmentID);
        System.out.println("Learner: " + learnerName);
        System.out.println("Course: " + courseName);
        System.out.printf("Fee: Rs. %.2f%n", fee);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class CourseEnrollment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enrollment ID: ");
        String id = sc.nextLine();

        System.out.print("Learner: ");
        String learner = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Fee: ");
        double fee = sc.nextDouble();

       
        Enrollment en = new Enrollment(id, learner, course, fee);

        en.displaySummary();

        sc.close();
    }
}