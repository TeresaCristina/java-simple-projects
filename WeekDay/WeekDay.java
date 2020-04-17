// Teresa Cristina Paixao Costa
// 16, April, 2020
// WeekDay.java

package Default;
import java.util.Scanner;

public class WeekDay {

	private int year;
	private int month;
	private int day;
	private int dayWeek;
	private String weekDay;
	private Boolean leapYear;

	final private String weekDays[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wendnesday", "Thursday", "Friday" };
	final private String errorMsg = "Impossible to Calculate => Check the Input";

	public WeekDay() {
		Scanner myInput = new Scanner(System.in);
		// Get the year
		do {
			System.out.println("Enter year (e.g., 2012): ");
			year = GetInput.validInteger(myInput);
		} while (validYear() == false);
		// Get the month
		do {
			System.out.println("Enter month (1-12): ");
			month = GetInput.validInteger(myInput);
		} while (validMonth() == false);
		// Get the day
		do {
			System.out.println("Enter the day of the month (1-31): ");
			day = GetInput.validInteger(myInput);
		} while (validDay() == false);
		// Output Result
		weekDayOutput();
		myInput.close();
	}// !WeekDay()

	private boolean validYear() {
		boolean validYear = true;
		if (year < 0) {
			System.out.println("Year must be a positive number!");
			validYear = false;
		} else {
			if ((year % 4) == 0 && (year % 100) != 0) {
				leapYear = true;
			}
		}
		return validYear;
	}// !validYear()

	private boolean validMonth() {
		boolean validMonth = true;
		if (month < 0 || month > 12) {
			System.out.println("Month must be a number between 1 (January) and 12 (December)!");
			validMonth = false;
		} 
		return validMonth;
	}// !validMonth()

	private boolean validDay() {
		boolean validDay = true;
		if (day < 1) {
			System.out.println("A day of the month has to be a positive number!");
			validDay = false;
		} else if (day > 31) {
			System.out.println("A month cannot have more then 31 days!");
		} else if (day > 29 && month == 2) {
			System.out.println("February can only have up to 29 says!");
			validDay = false;
		} else if (day == 29 && month == 2 && leapYear == false) {
			System.out.println("It is not a leap year, so February can only have 28 days.");
			validDay = false;
		}
		return validDay;
	}// !validDay()
	
	private void weekDayOutput() {
		dayWeek = SpecialNumber.Zeller(day, month, year);
		if (dayWeek > -1 && dayWeek < 7) {
			weekDay = "The day of the week is: " + weekDays[dayWeek];
		} else {
			weekDay = errorMsg;
		}		
		System.out.println(weekDay);
	}// !weekDayOutput()

}// ! WeekDay.java
