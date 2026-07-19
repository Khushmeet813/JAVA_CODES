package Day_7;

import java.util.Scanner;

public class DailyExpense {

    public static void main(String[] args) {
    	
    	// Practical 3: Daily Expense Tracker

        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];
        double total = 0;
        double budget;
        int overBudget = 0;

        System.out.print("Enter expenses for 7 days:");

        for (int i = 0; i < 7; i++) {

            expenses[i] = sc.nextDouble();

            if (expenses[i] < 0) {
                System.out.println("Invalid! Expense cannot be negative.");
                i--; 
                continue;
            }

            total += expenses[i];
        }

        System.out.print("Enter Daily Budget Limit: ");
        budget = sc.nextDouble();

        if (budget < 0) {
            System.out.println("Invalid Budget.");
            sc.close();
            return;
        }

        for (int i = 0; i < 7; i++) {
            if (expenses[i] > budget) {
                overBudget++;
            }
        }

        double average = total / 7.0;

        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total Spending: Rs. %.2f\n", total);
        System.out.printf("Average Daily Spending: Rs. %.2f\n", average);
        System.out.println("Days Above Budget: " + overBudget);

        sc.close();
    }
}
