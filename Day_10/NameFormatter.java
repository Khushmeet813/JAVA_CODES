package Day_10;

import java.util.Scanner;

public class NameFormatter {

    public static void main(String[] args) {
    	
    	//Practical 3: Student Name Formatter

        Scanner sc = new Scanner(System.in);

        System.out.print("First Name: ");
        String first = sc.nextLine().trim();

        System.out.print("Middle Name (Press Enter if none): ");
        String middle = sc.nextLine().trim();

        System.out.print("Last Name: ");
        String last = sc.nextLine().trim();

       
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();

        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName;
        String initials;

        if (middle.isEmpty()) {

            fullName = first + " " + last;
            initials = first.charAt(0) + ". " + last.charAt(0);

        } else {

            middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();

            fullName = first + " " + middle + " " + last;
            initials = first.charAt(0) + ". " + middle.charAt(0) + ". " + last.charAt(0);
        }

        System.out.println("\nFormatted Name: " + fullName);
        System.out.println("Initial Format: " + initials);

        sc.close();
    }
}