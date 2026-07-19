package Day_5;

import java.util.Scanner;


public class ModularStudentResult {

	public static void main(String[] args) {
		
		// Practical 1: Modular Student Result Service
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 subject marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        
        int total = calculateTotal(m1, m2, m3, m4, m5);
        double percentage = calculatePercentage(total, 500);
        boolean status = isPassed(percentage);
        
        
        System.out.println("STUDENT RESULT");
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        if (status) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }
       
        
        sc.close();
    }
		    
		    public static int calculateTotal(int a, int b, int c, int d, int e) {
		        return a + b + c + d + e;
		    }
		    
		    public static double calculatePercentage(int total, int maxMarks) {
		        return ((double)total / maxMarks) * 100;
		    }
		    
		    public static boolean isPassed(double percentage) {
		        return percentage >= 40;
		    }
		}
