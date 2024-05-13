// Define Sphere class by extending the shape class
public class Sphere extends Shape {
	private double radius;  // Instance variable radius of the sphere
	
	// Constructor with parameter to initialize radius
	public Sphere(double radius) {
		this.radius = radius;  // Assigning the passed radius value to the instance variable
	}
	
	// Method to calculate surface area of a sphere
	@Override  // Indicates that this method overrides a method in the superclass
	public double surface_area() {  // Define a method named surface_area to calculate the area of a cylinder
		return 4 * Math.PI * radius *radius;  // Formula to calculate the surface area of a sphere
	}
	
	//  Method to calculate the volume of the sphere
	@Override
	public double volume() {
		return (4 * Math.PI * radius * radius * radius) / 3;  // Formula to calculate the volume of a sphere
	}
}
