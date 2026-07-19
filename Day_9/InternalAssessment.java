package Day_9;

import java.util.Scanner;

public class InternalAssessment {

    public static void main(String[] args) {
    	
    	// Practical 1: Internal Assessment Summary

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[5][3];

        System.out.println("Enter marks for 5 students (3 assessments each):");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nINTERNAL ASSESSMENT SUMMARY");

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;

            System.out.printf("Student %d: Total  %d, Average %.2f\n",
                    i + 1, total, average);
        }

        sc.close();
    }
}