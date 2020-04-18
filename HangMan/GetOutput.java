// Teresa Cristina Paixao Costa 
// 25, January, 2020
// GetOutput.java

public class GetOutput {

	private final static String space = " ";
	
	// This method returns a char array as a string
	public static String getArray(char[] myArray) {
		String myWord = "";
		for (int i = 0; i < myArray.length; i++) {
			myWord += myArray[i];
		}
		return myWord;
	}// !getArray()

}// !GetOutput()
