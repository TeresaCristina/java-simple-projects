// Teresa Cristina Paixao Costa 
// 18, April, 2020
// MyProgram.java

public class MyProgram {

	public static void main(String[] args) {

		// Creates a geometric object
		
		System.out.println("\t\tLet`s create a new triangle!\n");

		GetInput newSide = new GetInput("Enter Side One: ");
		double sideOne = newSide.returnDouble();
		newSide = new GetInput("Enter Side Two: ");
		double sideTwo = newSide.returnDouble();
		newSide = new GetInput("Enter Side Three: ");
		double sideThree = newSide.returnDouble();
		Triangle myTriangle = new Triangle(sideOne, sideTwo, sideThree);

		newSide = new GetInput("Enter a Color: ");
		myTriangle.setColor(newSide.returnOutput());

		newSide = new GetInput("Filled (true or false): ");
		myTriangle.setFilled(newSide.returnBoolean());

		System.out.println(myTriangle.toString());
	}// !main()

}// !myProgram()
