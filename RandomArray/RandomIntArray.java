// Teresa Cristina Paixao Costa 
// 18, April, 2020
// RandomIntArray.java

public class RandomIntArray {
	
	private int[] arrayInt;
	
	public RandomIntArray(int size, boolean typeInteger) {
			arrayInt = new int[size];
			fillArray(typeInteger);		
	}// !RandomIntArray()
	
	private void fillArray(boolean typeInteger) {
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = new RandomInteger(typeInteger).returnInteger();
		}
	}// !fillArray()
	
	public int[] returnArray() {
		return arrayInt;
	}// !returnArray()
	
	public void arrayToString() {
		for (int i = 0; i < arrayInt.length ; i++) {
			System.out.println(i + " : " + arrayInt[i]);
		}
	}// !arrayToString()

}// !RandomIntArray()
