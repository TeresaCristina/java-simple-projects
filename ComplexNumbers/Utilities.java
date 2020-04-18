// Teresa Cristina Paixao Costa 
// 18, April, 2020
// Utilities.java

public class Utilities {

	// Receives an array of strings and returns an array of doubles
	public static double[] stringToDouble(String[] newString) {
		double doubleInput[] = new double[2];
		for (int i = 0; i < newString.length; i++) {
			try {
				doubleInput[i] = Double.parseDouble(newString[i]);
			} catch (NumberFormatException typeError) {
				System.err.println("Invalid String (not a Double): ");
				typeError.printStackTrace();
			}
		}
		return doubleInput;
	}// !stringToDouble()

}// !Utilities.java
