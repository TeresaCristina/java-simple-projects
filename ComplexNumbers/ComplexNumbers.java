// Teresa Cristina Paixao Costa 
// 18, April, 2020
// ComplexNumbers.java

public class ComplexNumbers implements MathOperations {

	private double realPart;
	private double imaginaryPart;
	private double absoluteValue;

	// Constructors

	public ComplexNumbers(double a) {
		realPart = a;
		imaginaryPart = 0;
		absoluteVal();
	}

	public ComplexNumbers(double a, double b) {
		realPart = a;
		imaginaryPart = b;
		absoluteVal();
	}

	// Private Methods
	
	private void absoluteVal() {
		absoluteValue = (realPart * realPart) + (imaginaryPart * imaginaryPart);
		absoluteValue = Math.sqrt(absoluteValue);
	}// !absoluteVal()

	
	private String doubleToString() {
		String myResult = "";
		if (realPart > 0 || realPart < 0) {
			myResult += realPart + " + ";
		}
		if (imaginaryPart > 0 || imaginaryPart < 0) {
			myResult += imaginaryPart;
		}
		return myResult;
	}// !toString();
	
	private ComplexNumbers add(ComplexNumbers number) {
		double sumReal = realPart + number.realPart;
		double sumImag = imaginaryPart + number.imaginaryPart;
		ComplexNumbers sumNumber = new ComplexNumbers(sumReal, sumImag);
		return sumNumber;
	}// !add()

	private ComplexNumbers subtract(ComplexNumbers number) {
		double subReal = realPart - number.realPart;
		double subImag = imaginaryPart - number.imaginaryPart;
		ComplexNumbers subNumber = new ComplexNumbers(subReal, subImag);
		return subNumber;
	}// !subtract()

	private ComplexNumbers multiply(ComplexNumbers number) {
		double firstArg = (realPart * number.realPart) - (imaginaryPart * number.imaginaryPart);
		double secArg = (imaginaryPart * number.realPart) + (realPart * number.imaginaryPart);
		ComplexNumbers multiplyNumber = new ComplexNumbers(firstArg, secArg);
		return multiplyNumber;
	}// !multiply()

	private ComplexNumbers divide(ComplexNumbers number) {
		double firstArg = (realPart * number.realPart) + (imaginaryPart * number.imaginaryPart);
		firstArg = firstArg / absoluteValue * absoluteValue;
		double secArg = (imaginaryPart * number.realPart) - (realPart * number.imaginaryPart);
		secArg = secArg / absoluteValue * absoluteValue;
		ComplexNumbers divideNumber = new ComplexNumbers(firstArg, secArg);
		return divideNumber;
	}// !divide()
	
	// Methods Implemented for the Interface
	
	public void returnSum(ComplexNumbers secondNumber) {
		ComplexNumbers mySum = add(secondNumber);
		System.out.println("Sum: " + mySum.doubleToString());
	}// !returnSum()
	
	public void returnSubtract(ComplexNumbers secondNumber) {
		ComplexNumbers mySub = subtract(secondNumber);
		System.out.println("Subtraction: " +  mySub.doubleToString());
	}// !returnSubtract()
	
	public void returnDivide(ComplexNumbers secondNumber) {
		ComplexNumbers myDiv = divide(secondNumber);
		System.out.println("Division: " + myDiv.doubleToString());
	}// !returnDivide()
	
	public void returnMultiply(ComplexNumbers secondNumber) {
		ComplexNumbers myMult = multiply(secondNumber);
		System.out.println("Multiplication: " + myMult.doubleToString());
	}// !returnMultiply()

}// !ComplexNumbers.java
