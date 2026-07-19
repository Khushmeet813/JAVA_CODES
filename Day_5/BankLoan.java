package Day_5;

import java.util.Scanner;

public class BankLoan {

	public static void main(String[] args) {
		
		// Practical 2: Bank Loan EMI 
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Annual Interest Rate: ");
        double rate = sc.nextDouble();
        
        System.out.print("Loan Period in Years: ");
        double years = sc.nextDouble();
        
        System.out.print("Number of Months: ");
        int months = sc.nextInt();
        
        double interest = calculateInterest(principal, rate, years);
        double totalPayable = calculateTotalPayable(principal, interest);
        double monthlyInstallment = calculateMonthlyInstallment(totalPayable, months);
        
        System.out.println("LOAN ESTIMATE");
        System.out.printf("Simple Interest: Rs. %.2f\n", interest);
        System.out.printf("Total Payable: Rs. %.2f\n", totalPayable);
        System.out.printf("Monthly Instalment: Rs. %.2f\n", monthlyInstallment);
        
        sc.close();
    }
    
    public static double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    
    public static double calculateTotalPayable(double p, double interest) {
        return p + interest;
    }
    
    public static double calculateMonthlyInstallment(double total, int months) {
        return total / months;
    }
}
