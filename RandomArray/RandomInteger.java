// Teresa Cristina Paixao Costa 
// 18, April, 2020
// RandomIntArray.java

import java.util.*;

public class RandomInteger {

	private int newInt;

	public RandomInteger(boolean typeInteger) {
		Random randNew = new Random();
		if (typeInteger == true) {
			newInt = randNew.nextInt(Integer.MAX_VALUE);
		} else {
			newInt = randNew.nextInt();
		}
	}// !RandomInteger()

	public int returnInteger() {
		return newInt;
	}// !returnInt()

}// RandomInteger.java
