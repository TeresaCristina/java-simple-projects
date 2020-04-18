// Teresa Cristina Paixao Costa
// 16, April, 2020
// SpecialNumber.java

public class SpecialNumber {
	
	// This method calculates the monthly payment to return a loan  
	public static double monthlyLoanPayment (double loanAmount, double rateMonth, int months) {
		double numerator = (loanAmount * rateMonth);
		double denominator = (1 - Math.pow(1 + rateMonth, -months));
		return numerator / denominator; 
	}// !monthlyLoanRate

}// !SpecialNumber.java