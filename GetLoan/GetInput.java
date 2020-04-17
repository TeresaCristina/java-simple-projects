// Teresa Cristina Paixao Costa
// 16, April, 2020
// GetInput.java

package Default;
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
	
	// This method checks for a double
	public static double validDouble(Scanner myInput) {
		double validDouble;
		if (myInput.hasNextDouble()) {
			validDouble = myInput.nextDouble();
		} else {
			validDouble = 0;
			myInput.nextLine();
		}
		
		return validDouble;
	}// !validDouble()
	
}// !GetInput.java