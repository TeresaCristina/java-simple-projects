// Teresa Cristina Paixao Costa 
// 18, April, 2020
// GetInput.java

import java.util.Scanner;

public class GetInput {

	private Scanner myInput;
	private String myOutput;

	// Constructor

	public GetInput(String myQuestion) {
		myInput = new Scanner(System.in);
		askUser(myQuestion);
	}// !GetInput

	// Private Methods

	private void askUser(String myQuestion) {
		System.out.println(myQuestion);
		myOutput = myInput.nextLine();
	}// !askUser()

	// Receives string and returns a boolean
	private boolean stringToBoolean() {
		boolean booleanInput = false;
		try {
			booleanInput = Boolean.parseBoolean(myOutput);
		} catch (NumberFormatException typeError) {
			System.err.println("Invalid String (not a Boolean): ");
			typeError.printStackTrace();
		}
		return booleanInput;
	}// !stringToBoolean()

	// Receives string and returns a double
	private double stringToDouble() {
		double doubleInput = 0;
		try {
			doubleInput = Double.parseDouble(myOutput);
		} catch (NumberFormatException typeError) {
			System.err.println("Invalid String (not a Double): ");
			typeError.printStackTrace();
		}
		return doubleInput;
	}// !stringDouble()

	// Receives string and returns an integer
	public int stringToInteger() {
		int integerInput = 0;
		try {
			integerInput = Integer.parseInt(myOutput);
		} catch (NumberFormatException typeError) {
			System.err.println("Invalid String (not an Integer): ");
			typeError.printStackTrace();
		}
		return integerInput;
	}// !stringToInteger()

	// Public Methods

	public String returnOutput() {
		return myOutput;
	}// !returnOutput()

	public boolean returnBoolean() {
		return stringToBoolean();
	}// !returnBoolean()

	public double returnDouble() {
		return stringToDouble();
	}// !returnDouble()
	
	public int returnInteger() {
		return stringToInteger();
	}// !returnInteger()

}// !GetInput()