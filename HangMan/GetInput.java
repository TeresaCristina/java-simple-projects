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

}// !GetInput.java