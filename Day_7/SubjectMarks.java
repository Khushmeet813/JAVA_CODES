package Day_7;

import java.util.Scanner;

public class SubjectMarks {

    public static void main(String[] args) {

    	// Practical 2: Five-Subject Marks Dashboard
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int passed = 0;
        int failed = 0;

        System.out.print("Enter marks for 5 subjects (0-100):");

        for (int i = 0; i < 5; i++) {

            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid! Enter marks between 0 and 100.");
                i--; 
                continue;
            }

            total += marks[i];

            if (marks[i] >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = total / 5.0;

        System.out.println("\nMARKS DASHBOARD");
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);

        sc.close();
    }
}
