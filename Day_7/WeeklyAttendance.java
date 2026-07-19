package Day_7;

import java.util.Scanner;

public class WeeklyAttendance {
		 // Practical 1: Weekly Attendance Recorder
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] attendance = new int[7];
	        int present = 0;

	        System.out.print("Enter attendance for 7 days (1 for Present, 0 for Absent):");

	        for (int i = 0; i < 7; i++) {

	            attendance[i] = sc.nextInt();

	            if (attendance[i] == 1) {
	                present++;
	            } 
	            else if (attendance[i] == 0) {
	              //absent 
	            } 
	            else {
	                System.out.println("Invalid! Enter 0 or 1 only.");
	                i--;
	            }
	        }

	        int absent = 7 - present;
	        double percentage = (present * 100.0) / 7;

	        System.out.println("\nWEEKLY ATTENDANCE");
	        System.out.println("Present Days: " + present);
	        System.out.println("Absent Days: " + absent);
	        System.out.printf("Attendance: %.2f%%\n", percentage);

	        sc.close();
	    }
	}