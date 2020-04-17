// Teresa Cristina Paixao Costa
// 16, April, 2020
// RockPaperScissor.java

package Default;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	private int systemAnswer;
	private int userAnswer;
	private String result;

	final private String roundChoice[] = { "Scissor", "Rock", "Paper" };
	final private String userString = "You won!";
	final private String computerString = "Computer won!";

	public RockPaperScissor() {
		// System answer
		Random randObj = new Random();
		systemAnswer = randObj.nextInt(2);
		// User Answer
		Scanner userInput = new Scanner(System.in);
		do {
			System.out.println("Scissor (0), Rock (1), Paper (2): ");
			userAnswer = GetInput.validInteger(userInput);
		} while (validAnswer() == false);
		outputResult();
	}// !RockPaperScissor()

	private Boolean validAnswer() {
		Boolean validAnswer = true;
		if (userAnswer > 2 || userAnswer < 0) {
			System.out.println("Input must be a number between 0 (inclusive) and 3 (inclusive)");
			validAnswer = false;
		}
		return validAnswer;
	}// !validAnswer()

	private void outputResult() {
		System.out.println("Computer is " + roundChoice[systemAnswer]);
		System.out.println("You are " + roundChoice[userAnswer]);
		
		Boolean firstR = (systemAnswer == 0 && userAnswer == 1);
		Boolean secondR = (systemAnswer == 1 && userAnswer == 2);
		Boolean thirdR = (systemAnswer == 2 && userAnswer == 0);

		if (systemAnswer != userAnswer) {
			if (firstR == true || secondR == true || thirdR == true) {
				result = userString;
			} else {
				result = computerString;
			}
		} else {
			result = "It is a draw!";
		}

		System.out.println(result);
	}// !giveResult()
}