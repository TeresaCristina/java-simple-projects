// Teresa Cristina Paixao Costa 
// 18, April, 2020
// GetInput.java

import java.util.Scanner;

public class GetInput {

	private Scanner myInput;
	private String myOutput;

	// Constructor
	
	public GetInput(String myQuestion) {
		myInput = new Scanner(System.in);
		askUser(myQuestion);
	}// !GetInput

	// Private Methods
	
	private void askUser(String myQuestion) {
		System.out.println(myQuestion);
		myOutput = myInput.nextLine();
	}// !askUser()

	// Public Methods
	
	public String returnOutput() {
		return myOutput;
	}// !returnOutput()

}// !GetInput()