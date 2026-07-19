package Day_13;

import java.util.Scanner;

// Practical 1: Product Billing with this

class Product {
    String productID;
    String name;
    double price;
    int quantity;

    Product(String productID, String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void displayProductBill() {
        System.out.println("\nPRODUCT BILL");
        System.out.println("Product: " + productID + " - " + name);
        System.out.printf("Price: Rs. %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Value: Rs. %.2f%n", calculateTotalValue());
    }
}

public class ProductBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Product ID: ");
        String productID = sc.nextLine();

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product prod = new Product(productID, name, price, quantity);

        prod.displayProductBill();

        sc.close();
    }
}