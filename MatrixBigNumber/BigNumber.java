// Teresa Cristina Paixao Costa 
// 25, January, 2020
// BigNumber.java

import java.util.Scanner;

public class BigNumber {

	private int rows;
	private int columns;
	private int rowNumber;

	private int[][] matrix;
	private String[] newRow;

	private Scanner myInput;

	public final int IntegerArray = 0;

	public BigNumber() {
		myInput = new Scanner(System.in);
		// Creates a Matrix with user input
		BuildMatrix newMatrix = new BuildMatrix(IntegerArray);
		matrix = newMatrix.integerMatrix();
		rows = matrix.length;
		columns = matrix[0].length;
		fillMatrix();
		outputBig();
	}// !BigNumber()

	private void fillMatrix() {
		rowNumber = 0;
		do {
			System.out.println("Enter " + columns + " numbers separated by a space (\" \"):");
			newRow = myInput.nextLine().split(" ");
			if (newRow.length != columns) {
				System.out.println("Invalid row: it has " + newRow.length + " elements.");
			} else {
				if (validMatrixLine() == true) {
					fillMatrixLine();
					System.out.println("Row " + (rowNumber++) + ": " + GetOutput.getMatrixLine(newRow));
				}else {
					System.out.println("Invalid row: some elements are not numbers.");
				}
			}
		} while (rowNumber < rows);
	}// !buildArray()

	private void fillMatrixLine() {
		for (int j = 0; j < columns; j++) {
			matrix[rowNumber][j] = Integer.parseInt(newRow[j]);
		}
	}// !fillMatrixLine()

	private Boolean validMatrixLine() {
		Boolean validRow = true;
		for (int i = 0; i < newRow.length; i++) {
			validRow = BuildMatrix.validInteger(newRow[i]);
		}
		return validRow;
	}// !validMatrixLine()

	private void outputBig() {
		int output[] = BuildMatrix.largestInt(matrix);
		System.out.println("The largest number is " + output[0] + ".");
		System.out.println("Row " + output[1] + ".");
		System.out.println("Column " + output[2] + ".");
	}// !outputBig()

}// !BigNumber.java
