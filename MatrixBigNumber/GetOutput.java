// Teresa Cristina Paixao Costa 
// 25, January, 2020
// GetOutput.java

public class GetOutput {

	private final static String space = " ";

	// This method returns a String array as a string
	public static String getMatrixLine(String[] myArray) {
		String myWord = "";
		for (int i = 0; i < myArray.length; i++) {
			myWord = myWord + myArray[i] + space;
		}
		return myWord;
	}
}// !GetOutput()
