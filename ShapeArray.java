// Create a driver class names "ShapeArray'
import java.util.Scanner;

public class ShapeArray {  
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);  // Create a Scanner object
		
		// Use getValidDoubleInput method, prompt user for the radius of a sphere
		double sphereRadius = getValidDoubleInput(scnr, "Enter the radius for a sphere in inches: " );
		// Use getValidDoubleInput method, prompt user for the radius and height of a cylinder
		double cylinderRadius = getValidDoubleInput(scnr, "Enter the radius for a cylinder in inches: ");
		double cylinderHeight = getValidDoubleInput(scnr, "Enter the height of a cylinder in inches: ");
		// Use getValidDoubleInput method, prompt user for the radius and height of a cone
		double coneRadius = getValidDoubleInput(scnr, "Enter the radius for a cone in inches: ");
		double coneHeight = getValidDoubleInput(scnr, "Enter the height of a cone in inches: ");
		
		// Create objects
		Sphere sphere = new Sphere(sphereRadius);
		Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
		Cone cone = new Cone(coneRadius, coneHeight);
		
		// Create an array to save the objects
		Shape[] shapeArray = {sphere, cylinder, cone}; 
		
		// Loop through the array and print the objects
		for (Shape shape : shapeArray) {
			System.out.println(shape);  //Using overridden toString method to print shapes details
		}
		scnr.close();  // Close the Scanner object
	}
	
	// Method to get valid input from user
	private static double getValidDoubleInput(Scanner scanner, String prompt) { // Declare a method named getValidDoubleInput which takes a Scanner object and a prompt as parameters
		double value; // Declare a double variable named value to store the user input
	    while (true) { // Start an infinite loop (continue looping until a valid input is obtained)
	    	System.out.print(prompt); // Display the prompt to the user
	        String input = scanner.nextLine(); // Read the user input as a String
	        try { // Start a try-catch block to handle NumberFormatException
	        	value = Double.parseDouble(input); // Parse the input String to a double
	            if (value <= 0) { // Check if the input is less than or equal to 0
	            	System.out.println("Please enter a positive number greater than 0."); // Display an error message if the input is invalid
	            } else { // If the input is valid
	            	break; // Exit the loop
	            }
	        } catch (NumberFormatException e) { // Catch NumberFormatException if the input cannot be parsed as a double
	        	System.out.println("Invalid input. Please enter a valid number."); // Display an error message if the input is not a valid number
	        }
	    }
	    return value; // Return the valid input value
	}
}
