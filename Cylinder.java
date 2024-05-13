// Define cylinder class extending the shape class
public class Cylinder extends Shape {
	private double radius;  // Instance variable radius of cylinder
	private double height;  // Instance variable height of cylinder
	
	// Constructor with parameters to initialize the radius and height
	public Cylinder(double radius, double height) { 
        this.radius = radius; // Assigning the passed radius value to the instance variable
        this.height = height; // Assigning the passed height value to the instance variable
    }
	
	// Method to calculate surface area of a cylinder
	@Override  // Indicates that this method overrides a method in the superclass
	public double surface_area() {   // Define a method named surface_area to calculate the area of the cylinder
		return 2 * Math.PI * radius * (radius + height);  // Calculate and return the surface area of the cylinder
	}
	
	// Method to calculate the volume of the cylinder
	@Override   // Indicates that this method overrides a method in the superclass
	public double volume() {  // Define a method named volume to calculate the volume of the cylinder
		return Math.PI * radius * height; //Calculate and return the volume of the cylinder
	}
}
