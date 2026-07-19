package Day_11;

import java.util.Scanner;

class Student {
	
	//Practical 1: Student Academic Profile

    int rollNumber;
    String name;
    int marks;
    int attendance;

    void assignData(int roll, String n, int m, int att) {
        rollNumber = roll;
        name = n;
        marks = m;
        attendance = att;
    }

    String calculateResult() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    void displayProfile() {
        System.out.println(rollNumber + " - " + name +
                " - Marks: " + marks +
                " - Attendance: " + attendance + "% - " +
                calculateResult());
    }
}

public class StudentAcademicProfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            students[i] = new Student();

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();

            System.out.print("Attendance: ");
            int attendance = sc.nextInt();

            students[i].assignData(roll, name, marks, attendance);
            sc.nextLine(); 
        }

        System.out.println("\nSTUDENT PROFILES");

        for (int i = 0; i < n; i++) {
            students[i].displayProfile();
        }

        sc.close();
    }
}
