package Day_8;

import java.util.Scanner;

public class TaxArray {

    public static void main(String[] args) {
    	
    	// Practical 3: Return a Tax-Adjusted Array

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of items: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        System.out.print("GST Percentage: ");
        double gstRate = sc.nextDouble();

        double[] adjustedPrices = addTax(prices, gstRate);

        System.out.print("ORIGINAL PRICES: ");
        for (double price : prices) {
            System.out.printf("%.2f ", price);
        }

        System.out.print("\nGST-ADJUSTED PRICES: ");
        for (double price : adjustedPrices) {
            System.out.printf("%.2f ", price);
        }

        System.out.println();

        sc.close();
    }

    public static double[] addTax(double[] prices, double taxRate) {

        double[] taxed = new double[prices.length];

        for (int i = 0; i < prices.length; i++) {
            taxed[i] = prices[i] + (prices[i] * taxRate / 100);
        }

        return taxed;
    }
}