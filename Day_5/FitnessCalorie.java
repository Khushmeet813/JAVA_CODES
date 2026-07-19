package Day_5;

import java.util.Scanner;


public class FitnessCalorie {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Weight (kg): ");
	        double weight = sc.nextDouble();
	        
	        System.out.print("Height (metres): ");
	        double height = sc.nextDouble();
	        
	        double bmi = calculateBMI(weight, height);
	        String category = getBMICategory(bmi);
	        
	        System.out.println("FITNESS REPORT");
	        System.out.printf("BMI: %.2f\n", bmi);
	        System.out.println("Category: " + category);
	        System.out.println("Recommendation: Maintain regular exercise and balanced diet.");
	        
	        sc.close();
	    }
	    
	    public static double calculateBMI(double w, double h) {
	        return w / (h * h);
	    }
	    
	    public static String getBMICategory(double bmi) {
	        if(bmi < 18.5) {
	        	return "Underweight";
	        }
	        else if (bmi < 24.9) {
	        	return "Normal";
	        }
	        else { 
	        	return "Overweight";
	    }
	        
	}
}
