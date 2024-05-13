// Create abstract class named "Shape"
public abstract class Shape {
	
	public abstract double surface_area();  // Create abstract method "surfaceArea()" of return type double
	public abstract double volume();  // Create abstract method "volume()" of return type double
	
	// Method to represent shape as string
    @Override
    public String toString() {
        return String.format("%s - Surface Area: %.2f sqin, " +
        					 "Volume: %.2f in³", 
        					 getClass().getSimpleName(), 
        					 surface_area(), 
        					 volume());
    }
}
