// Teresa Cristina Paixao Costa
// 16, April, 2020
// GetInput.java

import java.util.Scanner;

public class GetInput {
	
	// This method checks for an integer
	public static int validInteger(Scanner myInput) {
		int validInteger;
		if (myInput.hasNextInt()) {
			validInteger = myInput.nextInt();
		} else {
			validInteger = -1;
			myInput.nextLine();
		}
		return validInteger;
	}// !validInteger()
	
}// !GetInput.java