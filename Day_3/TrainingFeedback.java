package Day_3;

import java.util.Scanner;

public class TrainingFeedback {

	public static void main(String[] args) {
		
	
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Content rating (1-5): ");
        int content = sc.nextInt();
        
        System.out.print("Explanation rating (1-5): ");
        int explanation = sc.nextInt();
        
        System.out.print("Practical rating (1-5): ");
        int practical = sc.nextInt();
        
        
        int totalRating = content + explanation + practical;
        double averageRating = totalRating / 3.0;
        
        
        System.out.println("\nTRAINING FEEDBACK");
        System.out.println("Content: " + content + "/5");
        System.out.println("Explanation: " + explanation + "/5");
        System.out.println("Practical Work: " + practical + "/5");
        System.out.printf("Average Rating: %.2f/5\n", averageRating);
        
        
        sc.close();
		

	}

}
