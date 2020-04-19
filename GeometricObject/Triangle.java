// Teresa Cristina Paixao Costa 
// 18, April, 2020
// Triangle.java

public class Triangle extends GeometricObject {

	private double sideOne;
	private double sideTwo;
	private double sideThree;
	private double area;
	private double perimeter;

	// Constructors
	public Triangle() {
		sideOne = 1;
		sideTwo = 1;
		sideThree = 1;
		getResults();
	}

	public Triangle(double one, double two, double three) {
		sideOne = one;
		sideTwo = two;
		sideThree = three;
		getResults();
	}

	// Private methods
	
	private boolean checkValid() {
		boolean isValid = true;
		if ((sideOne + sideTwo < sideThree) || (sideOne + sideThree < sideTwo) || (sideTwo + sideThree > sideTwo)) {
			isValid = false;
		}
		return isValid;
	}// !checkValid()

	private void getResults() {
		if (checkValid() == true) {
			getPerimeter();
			getArea();
		} else {
			System.out.println("This is not a valid triangle (Sides: a + b > c).");
			perimeter = 0;
			area = 0;
		}
	}// !getResults()

	private void getArea() {
		double p = perimeter / 2;
		area = p * (p - sideOne) * (p - sideTwo) * (p - sideThree);
		area = Math.sqrt(area);
	}// !getArea()

	private void getPerimeter() {
		perimeter = sideOne + sideTwo + sideThree;
	}// !getPerimeter()

	// Public methods

	public String toString() {
		String result = "Triagle: \n\tSide 1 = " + sideOne + "\n";
		result += "\tSide 2 = " + sideTwo + "\n";
		result += "\tSide 3 = " + sideThree + "\n";
		result += "\tArea: " + area + "\n" + "\tPerimeter: " + perimeter;
		result += super.toString();
		return result;
	}// !toString()

	public double getSideOne() {
		return sideOne;
	}// !getSideOne()

	public double getSideTwo() {
		return sideTwo;
	}// !getSideTwo()

	public double getSideThree() {
		return sideThree;
	}// !getSideThree()

	public void setSide(int sideNumber, int sideSize) {
		if (sideNumber == 1) {
			sideOne = sideSize;
		} else if (sideNumber == 2) {
			sideTwo = sideSize;
		} else if (sideNumber == 3) {
			sideThree = sideSize;
		} else {
			System.out.println("Wrong side number (choose 1 , 2 or 3) :");
		}
		getResults();
	}// !setSide()

}// !Triangle.java