// Teresa Cristina Paixao Costa
// 16, April, 2020
// SpecialNumber.java

package Default;

public class SpecialNumber {
	
	// This method gives you the day of the week (0 = Saturday, 1 = Sunday, etc)
	public static int Zeller(int day, int month, int year) {
		if (month == 1 || month == 2) {
			month += 12;
			year = year - 1;
		}
		int yearCentury = (year) % 100;
		int century = (year) / 100;
		int dayWeek = (13 * (month + 1)) / 5;
		dayWeek += day + ((century + (5 * yearCentury)) / 4);
		dayWeek -= (2 * century);
		dayWeek = dayWeek % 7;
		return dayWeek;
	}// !numberZeller()

}// !SpecialNumber.java