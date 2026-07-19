package Day_13;

import java.util.Scanner;

// Practical 3: Shopping Cart Item Update

class Item {
    String itemName;
    double unitPrice;
    int quantity;

    Item(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    Item updateQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    double calculateAmount() {
        return unitPrice * quantity;
    }

    void display() {
        System.out.println("\nCART ITEM");
        System.out.println("Item: " + itemName);
        System.out.printf("Unit Price: Rs. %.2f%n", unitPrice);
        System.out.println("Updated Quantity: " + quantity);
        System.out.printf("Current Total: Rs. %.2f%n", calculateAmount());
    }
}

public class CartItem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        String itemName = sc.nextLine();

        System.out.print("Unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Initial quantity: ");
        int initialQuantity = sc.nextInt();

        System.out.print("Updated quantity: ");
        int updatedQuantity = sc.nextInt();

        Item item = new Item(itemName, unitPrice, initialQuantity);

        System.out.println("Initial Quantity: " + item.quantity);

        item.updateQuantity(updatedQuantity).display();

        sc.close();
    }
}