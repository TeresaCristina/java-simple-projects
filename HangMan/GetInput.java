// Teresa Cristina Paixao Costa 
// 25, January, 2020
// GetInput.java

package workshop_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GetInput {

	// This method checks if input is one letter
	public static char validOneCharacter(Scanner myInput, char invaliChar) {
		Pattern oneCharacter = Pattern.compile("[^\\d]");
		String validCharacter;
		char validOneChar;
		if (myInput.hasNext(oneCharacter)) {
			validCharacter = myInput.nextLine();
			validOneChar = validCharacter.charAt(0);
		} else {
			validOneChar = invaliChar;
			myInput.nextLine();
		}
		return validOneChar;
	}// !validOneCharacter()

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