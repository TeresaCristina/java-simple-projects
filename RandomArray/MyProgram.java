// Teresa Cristina Paixao Costa 
// 18, April, 2020
// MyProgram.java

public class MyProgram {

	public static void main(String[] args) {

		// Generates a random array of integers

		printHeadingRandomArray();
		GetInput newSize = new GetInput("Array size:");
		int arraySizeInt = Utilities.stringToInteger(newSize.returnOutput());
		RandomIntArray newArray = new RandomIntArray(arraySizeInt, Constants.ONLY_POSITIVE);
		newArray.arrayToString();
	}

	// Creates a random array of Integers
	private static void printHeadingRandomArray() {
		System.out.println("\t\t\tWelcome to the Array Generator!\n");
		System.out.println("This program generates an array of random integers");
	}// !printHeadingOne()

	
}// !myProgram()
