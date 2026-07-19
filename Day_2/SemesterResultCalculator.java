package Day_2;

import java.util.Scanner;

public class SemesterResultCalculator {

    public static void main(String[] args) {

        // Practical 1: Semester Result Calculator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 Subject: ");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int subject5 = sc.nextInt();

        int total = subject1 + subject2 + subject3 + subject4 + subject5;

        double percentage = (total / 500.0) * 100;
        boolean result = percentage >= 40;

        System.out.println("SEMESTER RESULT");
        System.out.println("Total Marks : " + total + " / 500");
        System.out.printf("Percentage: %.2f\n", percentage);

        if (result) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

    }
}