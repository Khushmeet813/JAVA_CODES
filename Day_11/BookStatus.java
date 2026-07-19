package Day_11;

import java.util.Scanner;

//Practical 3: Library Book Status

class Book {
    String bookID;
    String title;
    String author;
    boolean isAvailable = true;

    void assignData(String id, String t, String a) {
        bookID = id;
        title = t;
        author = a;
    }

    void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued!");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {
        System.out.println("Book Status: " + (isAvailable ? "Available" : "Issued"));
    }
}

public class BookStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Book ID: ");
        String id = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        b.assignData(id, title, author);

        System.out.print("Choice (Issue/Return): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Issue")) {
            b.issueBook();
            b.displayBook();

            System.out.print("Do you want to return the book? (Yes/No): ");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("Yes")) {
                b.returnBook();
                b.displayBook();
            }
        } 
        else if (choice.equalsIgnoreCase("Return")) {
            b.returnBook();
            b.displayBook();
        } 
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}