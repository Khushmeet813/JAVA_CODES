package Day_8;

import java.util.Scanner;

public class MonthlySales {

    public static void main(String[] args) {
    	
    	// Practical 2: Monthly Sales Performance

        Scanner sc = new Scanner(System.in);

        double[] sales = new double[12];

        readSales(sales, sc);

        System.out.print("Enter Target Amount: ");
        double target = sc.nextDouble();

        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f\n", calculateTotal(sales));
        System.out.printf("Average Monthly Sales: Rs. %.2f\n", calculateAverage(sales));
        System.out.println("Months Achieving Target: " + countTargetMonths(sales, target));

        sc.close();
    }


    public static void readSales(double[] sales, Scanner sc) {

        System.out.println("Enter 12 months sales data:");

        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextDouble();
        }
    }

    public static double calculateTotal(double[] sales) {
    	double total = 0;

        for (double sale : sales) {
            total += sale;
        }

        return total;
    }


    public static double calculateAverage(double[] sales) {
    	return calculateTotal(sales) / sales.length;
    }

    public static int countTargetMonths(double[] sales, double target) {
        int count = 0;

        for (double sale : sales) {
            if (sale >= target) {
                count++;
            }
        }

        return count;
    }
}