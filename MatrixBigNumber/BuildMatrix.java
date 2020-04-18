// Teresa Cristina Paixao Costa 
// 25, January, 2020
// BuildMatrix.java

import java.util.Scanner;

public class BuildMatrix {

	private int[][] intMatrix;
	private char[][] charMatrix;

	private int rows;
	private int columns;

	private final int IntegerArray = 0;
	private final int CharArray = 1;

	public BuildMatrix(int typeArray) {
		System.out.println("Lets build an Integer Matrix!");
		getDimensions();
		createMatrix(typeArray);
	}// !BuildMatrix()

	private void getDimensions() {
		do {
			System.out.println("Enter the number of rows:");
		} while (getRows() == false);
		do {
			System.out.println("Enter the number of columns:");
		} while (getColumns() == false);
	}// !getDimensions()

	private Boolean getRows() {
		Scanner myInput = new Scanner(System.in);
		Boolean isValidRows = true;
		if (GetInput.validInteger(myInput)) {
			rows = myInput.nextInt();
			if (rows <= 0) {
				System.out.println("Number of rows needs to be a positive integer!");
				isValidRows = false;
			}
		} else {
			System.out.println("Enter only numbers!");
			isValidRows = false;
		}
		return isValidRows;
	}// !getRows()

	private Boolean getColumns() {
		Scanner myInput = new Scanner(System.in);
		Boolean isValidColumns = true;
		if (GetInput.validInteger(myInput)) {
			columns = myInput.nextInt();
			if (columns <= 0) {
				System.out.println("Number of columns needs to be a positive integer!");
				isValidColumns = false;
			}
		} else {
			System.out.println("Enter only numbers!");
			isValidColumns = false;
		}
		return isValidColumns;
	}// !getColumns()

	private void createMatrix(int typeArray) {
		if (typeArray == IntegerArray) {
			intMatrix = new int[rows][columns];
		} else if (typeArray == CharArray) {
			charMatrix = new char[rows][columns];
		}
	}// !typeArray()

	// This method returns the highest integer in a matrix
	public static int[] largestInt(int[][] myMatrix) {
		int result[] = new int[3];
		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[i].length; j++) {
				if (myMatrix[i][j] > result[0]) {
					result[0] = myMatrix[i][j];
					result[1] = i;
					result[2] = j;
				}
			}
		}
		return result;
	}// !largestInt()
	
	public static Boolean validInteger(String myString) {
		Boolean validInteger = true;
		try {
			Integer.parseInt(myString);
		}catch (NumberFormatException myException){
			validInteger = false;
		}
		return validInteger;
	}// !validInteger()

	public int[][] integerMatrix() {
		return intMatrix;
	}// !integerMatrix()

	public char[][] charMatrix() {
		return charMatrix;
	}// !charMatrix()

}// !BuildMatrix()
