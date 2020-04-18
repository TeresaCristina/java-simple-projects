// Teresa Cristina Paixao Costa 
// 25, January, 2020
// CreditCard.java

public class CreditCard {

	private long creditCardNumber;
	private long[] digits;
	private int numberDig;

	private final int minDig = 13;
	private final int maxDig = 16;

	public CreditCard() {
		// Get a new number
		System.out.println("Enter the credit card number: ");
		AllocateNumber newNumber = new AllocateNumber(minDig, maxDig);
		creditCardNumber = newNumber.returnNumber();
		numberDig = newNumber.returnDigits();
		if (validatesCreditCard() == true) {
			System.out.println("This is a valid credit card number.");
		}
		numberDig = newNumber.returnDigits();
	}

	// Validates a corrected sized credit card number
	public Boolean validatesCreditCard() {
		Boolean isValid = true;
		separateDigits();
		if (checksPrefix() == true) {
			long sum = addEvenDigits() + addUnevenDigits();
			if (sum % 10 != 0) {
				System.out.println("This is not a valid number: sum is invalid. NOT PASSED");
				isValid = false;
			}
		} else {
			System.out.println("This is not a valid number: prefix is invalid. NOT PASSED");
			isValid = false;
		}
		return isValid;
	}// !validattesCreditCard()

	// Method that separates the digits of a number into an array
	public void separateDigits() {
		digits = new long[numberDig];
		int i = 0;
		while (creditCardNumber / 10 > 0) {
			digits[i] = creditCardNumber % 10;
			creditCardNumber = creditCardNumber / 10;
		}
		digits[i] = creditCardNumber;
	}// !separateDigits()

	// Checks if the number has a valid prefix digit
	public boolean checksPrefix() {
		boolean isPrefix = true;
		if (digits[numberDig - 1] < 4 || digits[numberDig - 1] > 6) {
			isPrefix = false;
		} else if (digits[numberDig - 1] == 3 && digits[numberDig - 2] != 7) {
			isPrefix = false;
		}
		return isPrefix;
	}// !checksPrefix()

	// Adds the digits in the even position
	public long addEvenDigits() {
		long sum = 0;
		for (int i = 1; i < numberDig; i = i + 2) {
			sum += addsTwoDigitsNumber(digits[i] * 2);
		}
		return sum;
	}// !addEvenDigits()

	// Returns the number or the sum of its two digits
	public long addsTwoDigitsNumber(long number) {
		if (number / 10 > 0) {
			number = (number % 10) + (number / 10);
		}
		return number;
	}// !addsTwoDigitsNumber()

	// Adds the digits in the uneven position
	public long addUnevenDigits() {
		long sum = 0;
		for (int i = 0; i < numberDig; i = i + 2) {
			sum += digits[i];
		}
		return sum;
	}// !addUnevenDigits()

}// !CreditCard.java
