package Day_9;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
    	
    	//Practical 3: Quiz Response Evaluation

        Scanner sc = new Scanner(System.in);

        char[] answerKey = new char[10];
        char[] responses = new char[10];

        System.out.println("Enter Answer Key:");

        for (int i = 0; i < 10; i++) {
            answerKey[i] = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("Enter Student Responses (Use X for Unattempted):");

        for (int i = 0; i < 10; i++) {
            responses[i] = sc.next().toUpperCase().charAt(0);
        }

        int correct = 0;
        int incorrect = 0;
        int unattempted = 0;

        for (int i = 0; i < 10; i++) {

            if (responses[i] == 'X') {
                unattempted++;
            } else if (responses[i] == answerKey[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        System.out.println("\nQUIZ RESULT");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Incorrect Answers: " + incorrect);
        System.out.println("Unattempted: " + unattempted);

        sc.close();
    }
}