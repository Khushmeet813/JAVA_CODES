package Day_10;

import java.util.Scanner;

public class Feedback {

    public static void main(String[] args) {

    	// Practical 2: Training Feedback Text Analyzer
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Feedback Sentence: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int symbols = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                symbols++;
            }
        }

        System.out.println("\nTEXT ANALYSIS");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Symbols: " + symbols);

        sc.close();
    }
}