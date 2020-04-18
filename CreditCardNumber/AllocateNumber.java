// Teresa Cristina Paixao Costa 
// 25, January, 2020
// AllocateNumber.java

import java.util.Scanner;

public class AllocateNumber {

	private long myNumber;
	private int minLimite;
	private int maxLimite;
	private int numberDigits;

	public AllocateNumber(int min, int max) {
		minLimite = min;
		maxLimite = max;
		Scanner myInput = new Scanner(System.in);
		do {
			myNumber = myInput.nextLong();
		} while (checkSize() == false);
		myInput.close();
	}

	// This method checks the valid size of a number
	private Boolean checkSize() {
		Boolean isValid = true;
		long size = numberDigits();
		if (size > maxLimite || size < minLimite) {
			isValid = false;
			System.out.print("Invalid number: too many (more then " + maxLimite + ") or too few (less then " + minLimite
					+ ") digits. NOT PASSED");
		}
		return isValid;
	}

	// This method returns the number of digits of a number
	private long numberDigits() {
		long testNumber = myNumber;
		while (testNumber / 10 > 0) {
			testNumber = testNumber / 10;
			numberDigits++;
		}
		return ++numberDigits;
	}// !numberDigits()

	public long returnNumber() {
		return myNumber;
	}// !returnNumber()

	public int returnDigits() {
		return numberDigits;
	}

}// !AllocateNumber.java
