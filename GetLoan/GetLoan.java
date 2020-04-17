// Teresa Cristina Paixao Costa
// 16, April, 2020
// GetLoan.java

package Default;

import java.util.Scanner;

public class GetLoan {

	private double loanAmount;
	private int years;
	private double rateYear;

	public GetLoan() {
		Scanner myInput = new Scanner(System.in);
		do {
			System.out.println("Loan Amount: ");
			loanAmount = GetInput.validDouble(myInput);
		} while (validLoanAmount() == false);
		do {
			System.out.println("Number of Years: ");
			years = GetInput.validInteger(myInput);
		} while (validYears() == false);
		do {
			System.out.println("Annual Interest Rate (max: 100): ");
			rateYear = GetInput.validDouble(myInput);
		} while (validRateYear() == false);

		outputPayments();
	}// !GetLoan()

	private Boolean validLoanAmount() {
		Boolean validAmount = true;
		if (loanAmount <= 0) {
			System.out.println("The Loan Amount must be bigger then 0.");
			validAmount = false;
		}
		return validAmount;
	}// !validLoanAmount()

	private Boolean validYears() {
		Boolean validYears = true;
		if (years <= 0) {
			System.out.println("The number of years must be bigger then 0.");
			validYears = false;
		} 
		return validYears;
	}// !validYears()

	private Boolean validRateYear() {
		Boolean validRate = true;
		if (rateYear <= 0 || rateYear > 100) {
			System.out.println("The interest rate must be bigger then 0 and smaller then 100.");
			validRate = false;
		}
		return validRate;
	}// !validRateYear()
	
	private void outputPayments() {
		double monthlyPayment = SpecialNumber.monthlyLoanPayment(loanAmount, rateYear / 1200, years * 12);
		double totalPayment = monthlyPayment * years * 12;
		
		double interest = rateYear / 1200 * loanAmount;
		double principal = monthlyPayment - interest;
		
		System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", totalPayment);
		System.out.println("Payment#\tInterest\tPrincipal\tBalance\n");

		for (int i = 1; i <= (years * 12); i++) {
			totalPayment -= monthlyPayment;
			System.out.printf("%d\t\t%5.2f\t\t%6.2f\t\t%7.2f\n", i, interest, principal, totalPayment);
		}

	}
}
