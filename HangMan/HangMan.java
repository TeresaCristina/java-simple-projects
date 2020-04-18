// Teresa Cristina Paixao Costa 
// 25, January, 2020
// HangMan.java

import java.util.Random;
import java.util.Scanner;

public class HangMan {

	private String myWord;
	private char[] myWordCoded;
	private int winnes;
	private int misses;
	private int corrLetters;
	private int letterIndex;

	private final String[] dictionary = { "write", "that", "terminator", "cow", "student" };
	private final char invalidCode = '*';
	private final int invalid = -1;

	public HangMan() {
		winnes = 0;
		misses = 0;
		corrLetters = 0;
		letterIndex = 0;
		secretWord();
		playGame();
	}// !Hanging()

        // Computer chooses a random word
	private void secretWord() {
		int randNumb = (new Random()).nextInt(dictionary.length - 1);
		myWord = dictionary[randNumb];
		myWordCoded = new char[myWord.length()];
		for (int i = 0; i < myWordCoded.length; i++) {
			myWordCoded[i] = invalidCode;
		}
	}// !secretWord()

	private void playGame() {
		Scanner myInput = new Scanner(System.in);
		do {
			System.out.print("Guess a letter: " + GetOutput.getArray(myWordCoded) + " >");
			char letter = GetInput.validOneCharacter(myInput, invalidCode);
			if (letter == invalidCode) {
				misses++;
				System.out.println("Invalid letter.\n");
			} else {
				checkInWord(letter);
			}
		} while (winnes < myWord.length());
		System.out.println("You guessed the word \"" + myWord + "\" with " + misses + " misses.");
	}// !playGame()

	private void checkInWord(char letter) {
		letterIndex = myWord.indexOf(letter);
		if (letterIndex == invalid) {
			misses++;
			System.out.println("You have " + misses + " misses.\n");
		} else {
			corrLetters++;
			System.out.println("You have " + corrLetters + " correct letters.\n");
			replaceLetter(letter);
		}
	}// !checkInWord()
	
	private void replaceLetter(char letter) {
		do {
			winnes++;
			myWordCoded[letterIndex] = letter;
			letterIndex = myWord.indexOf(letter, letterIndex + 1);
		} while (letterIndex != invalid);
	}// !replaceLetter()

	
}// !HangMan.java
