package Day_2;

import java.util.Scanner;

public class OnlineBill {

	public static void main(String[] args) {

		// Practical 3: Online Order Bill Calculator
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Item Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double subtotal = price * quantity;
        double discountAmount = (subtotal * discountPercent) / 100;
        double AfterDiscount = subtotal - discountAmount;
        double finalAmount = AfterDiscount + deliveryCharge;

        System.out.println("ORDER BILL");
        System.out.printf("Subtotal: Rs. %.2f\n", subtotal);
        System.out.printf("Discount: Rs. %.2f\n", discountAmount);
        System.out.printf("Delivery Charge: Rs. %.2f\n", deliveryCharge);
        System.out.printf("Final Payable Amount: Rs. %.2f\n", finalAmount);
        
        sc.close();
        
        
}
	}


