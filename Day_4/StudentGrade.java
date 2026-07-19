package Day_4;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
    	
    	// Practical 2: Student Grade and Scholarship Decision

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter Attendance: ");
        double attendance = sc.nextDouble();


        if (percentage < 0 || percentage > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Validation Error: Input value must be within 0 to 100.");
        } else {

            String grade;

            if (percentage >= 85) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C";
            } else {
                grade = "Fail";
            }

            boolean eligible = (percentage >= 85 && attendance >= 90);

            System.out.println("ACADEMIC DECISION");
            System.out.println("Grade: " + grade);
            if (eligible) {
                System.out.println("Scholarship: Eligible");
            } else {
                System.out.println("Scholarship: Not Eligible");
            }
            System.out.println("Validation: Input accepted");
        }

        sc.close();
    }
}
		
		

