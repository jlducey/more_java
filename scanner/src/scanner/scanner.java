package scanner;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args){
		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Output a prompt
		System.out.println("Input a line of text");

		// Wait for user input and stick in line
		String line = input.nextLine();

		// Print what was input
		System.out.println("you entered" + line);

	}

}
