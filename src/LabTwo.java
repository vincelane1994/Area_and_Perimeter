import java.util.Scanner;

public class LabTwo {

	private static Scanner scnr;

	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		double length;
		double width;
		char cont = 'y';


		while (cont == 'y') {
			System.out.println("Please enter the length of the room.");
			length = scnr.nextDouble();// User input an integer or double for the length of the room
			
			System.out.println("Please enter the width of the room");
			width = scnr.nextDouble();// User input an integer or double for the width of the room

			System.out.println("The area of the room is: " + (width * length));// Multiplies length with width for area
			System.out.println("The perimeter of the room is: " + ((2 * width) + (2 * length))); /* Multiplies both
																									sides by 2 then
																									adds together for
																									perimeter */
			System.out.println(" ");// Space for Visual esthetics
			System.out.println("Would you like to try another room? (Y/N)");// Option to do another room

			cont = scnr.next().charAt(0); // Gets first character so that the user can type in yes or no
			cont = Character.toLowerCase(cont); // Changes character to lower case so capitalization doesn't matter

		}
		System.out.println("Goodbye!");// Message if the user does not want to check another room.
	}

}
