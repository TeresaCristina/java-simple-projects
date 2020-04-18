// Teresa Cristina Paixao Costa 
// 18, April, 2020
// MyProgram.java

public class MyProgram {

	private static void printHeadingOne() {
		System.out.println("\t\t\tWelcome to the Complex Numbers Calculator!\n");
		System.out.println(
				"Tip: enter a complex number by writing the real part and the imaginary part separated by a space.");
		System.out.println("For example: \n 2.0 + 3.0i  ---->  2 3\n");
	}// !printHeadingOne()

	public static void main(String[] args) {

		// Complex Numbers Calculator
		printHeadingOne();
		String[] firstNumSt;
		String[] secondNumSt;

		do {
			GetInput firstNumber = new GetInput("Enter the first Complex Number:");
			firstNumSt = firstNumber.returnOutput().split(Constants.space);
		} while (firstNumSt.length != 2);

		do {
			GetInput secondNumber = new GetInput("Enter the second Complex Number:");
			secondNumSt = secondNumber.returnOutput().split(Constants.space);
		} while (secondNumSt.length != 2);

		double[] firstNumDouble = Utilities.stringToDouble(firstNumSt);
		double[] secondNumDouble = Utilities.stringToDouble(secondNumSt);

		ComplexNumbers firstComplexNumber = new ComplexNumbers(firstNumDouble[0], firstNumDouble[1]);
		ComplexNumbers secondComplexNumber = new ComplexNumbers(secondNumDouble[0], secondNumDouble[1]);

		firstComplexNumber.returnSum(secondComplexNumber);
		firstComplexNumber.returnSubtract(secondComplexNumber);
		firstComplexNumber.returnDivide(secondComplexNumber);
		firstComplexNumber.returnMultiply(secondComplexNumber);
	}

}// !myProgram()
