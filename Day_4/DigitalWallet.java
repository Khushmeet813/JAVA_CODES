package Day_4;

import java.util.Scanner;

public class DigitalWallet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;
        int choice;

        System.out.println("DIGITAL WALLET");

        do {

            System.out.println("\n1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount to Add: ");
                    double addAmt = sc.nextDouble();

                    if (addAmt > 0) {
                        balance += addAmt;
                        System.out.println("Money added successfully.");
                        System.out.printf("Current Balance: Rs. %.2f\n", balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Payment Amount: ");
                    double payAmt = sc.nextDouble();

                    if (payAmt > 0 && payAmt <= balance) {
                        balance -= payAmt;
                        System.out.println("Payment completed.");
                        System.out.printf("Current Balance: Rs. %.2f\n", balance);
                    } else {
                        System.out.println("Invalid amount or Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance: Rs. %.2f\n", balance);
                    break;

                case 4:
                    System.out.println("Thank you.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
