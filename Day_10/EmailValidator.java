package Day_10;

import java.util.Scanner;

public class EmailValidator {
	
    public static void main(String[] args) {
    	
    	//Practical 1: College Email Validator
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter email address: ");
        String email = sc.nextLine().trim();
        
        System.out.print("Required Domain: ");
        String targetDomain = sc.nextLine().trim();
        
        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        
        System.out.println("EMAIL VALIDATION");
        System.out.println("Email: " + email);
        
        if (firstAt > 0 && firstAt == lastAt && email.endsWith(targetDomain)) {
            System.out.println("Status: Valid college email");
        } else {
            System.out.println("Status: Invalid college email");
        }
        sc.close();
    }
}