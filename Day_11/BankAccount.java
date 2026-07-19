package Day_11;

import java.util.Scanner;

class Account {

    int accountNumber;
    String holderName;
    double balance;

    void assignData(int accNum, String name, double initialBal) {
        accountNumber = accNum;
        holderName = name;
        balance = initialBal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    void displayAccount() {
        System.out.println("\nACCOUNT SUMMARY");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.printf("Final Balance: Rs. %.2f\n", balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {
    	
    	// Practical 2: Bank Account Operations

        Scanner sc = new Scanner(System.in);

        Account ac = new Account();

        System.out.print("Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        ac.assignData(accNo, name, balance);

        System.out.print("Deposit Amount: ");
        double deposit = sc.nextDouble();
        ac.deposit(deposit);

        System.out.print("Withdraw Amount: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);

        ac.displayAccount();

        sc.close();
    }
}