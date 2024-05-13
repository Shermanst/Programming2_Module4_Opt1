// Define cone class extending the shape class
public class Cone extends Shape {
	private double radius;  // Instance variable radius of cone
	private double height;  // Instance variable height of cone
	
	// Constructor with parameters to initialize the radius and height
	public Cone(double radius, double height) { 
        this.radius = radius; // Assigning the passed radius value to the instance variable
        this.height = height; // Assigning the passed height value to the instance variable
    }
	
	// Method to calculate surface area of a cone
	@Override  // Indicates that this method overrides a method in the superclass
	public double surface_area() {   // Define a method named surface_area to calculate the area of the cone
		return 2 * Math.PI * radius * (radius + height);  // Calculate and return the surface area of the cone
	}
	
	// Method to calculate the volume of the cone
	@Override   // Indicates that this method overrides a method in the superclass
	public double volume() {  // Define a method named volume to calculate the volume of the cone
		return Math.PI * radius * height; //Calculate and return the volume of the cone
	}
}

