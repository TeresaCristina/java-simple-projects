// Teresa Cristina Paixao Costa 
// 18, April, 2020
// Utilities.java

public class Utilities {

	// Receives an array of strings and returns an array of doubles
	public static int stringToInteger(String newString) {
		int integerInput = 0;
		try {
			integerInput = Integer.parseInt(newString);
		} catch (NumberFormatException typeError) {
			System.err.println("Invalid String (not an Integer): ");
			typeError.printStackTrace();
		}
		return integerInput;
	}// !stringToDouble()

}// !Utilities.java
