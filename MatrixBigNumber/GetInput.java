// Teresa Cristina Paixao Costa 
// 25, January, 2020
// GetInput.java

import java.util.Scanner;
import java.util.regex.Pattern;

public class GetInput {

	// This method checks for an integer on user input
	public static Boolean validInteger(Scanner myInput) {
		Boolean validInteger = true;
		if (myInput.hasNextInt() == false) {
			validInteger = false;
			myInput.nextLine();
		}
		return validInteger;
	}// !validInteger()

	// This method checks for a double on user input
	public static Boolean validDouble(Scanner myInput) {
		Boolean validDouble = true;
		if (myInput.hasNextDouble() == false) {
			validDouble = false;
			myInput.nextLine();
		}
		return validDouble;
	}// !validDouble()

}// !GetInput.java