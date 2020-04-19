// Teresa Cristina Paixao Costa 
// 18, April, 2020
// GeometricObjects.java

public class GeometricObject {

	private String color;
	private boolean filled;

	// Constructors
	public GeometricObject() {
		color = "white";
		filled = true;
	}

	public GeometricObject(String newColor, boolean newFilled) {
		color = newColor;
		filled = newFilled;
	}

	// Query/Set Color
	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	//Query/Set Filled
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}

	// Overload
	public String toString() {
		return "\nColor: " + color + "\n It is filled? " + filled;
	}
}// !GeometricObjects()
