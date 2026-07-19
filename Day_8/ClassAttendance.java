package Day_8;

import java.util.Scanner;

public class ClassAttendance {

    public static void main(String[] args) {

    	// Practical 1: Class Attendance Analysis
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int size = sc.nextInt();

        double[] attendance = new double[size];

        readAttendance(attendance, sc);

        System.out.println("\nCLASS ATTENDANCE");
        System.out.printf("Class Average: %.2f%%\n", calculateAverage(attendance));
        System.out.println("Students Below 75%: " + countShortage(attendance, 75.0));

        sc.close();
    }

    public static void readAttendance(double[] values, Scanner sc) {

        System.out.println("Enter attendance percentages:");

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextDouble();
        }
    }

  
    public static double calculateAverage(double[] values) {
        double sum = 0;

        for (double val : values) {
            sum += val;
        }

        return sum / values.length;
    }

    public static int countShortage(double[] values, double limit) {

        int count = 0;

        for (double val : values) {
            if (val < limit) {
                count++;
            }
        }

        return count;
    }
}