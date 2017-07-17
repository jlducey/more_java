package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("mytext.txt");

		try {
			FileReader fr = new FileReader(file);
			// following line doesn't get executed if an exception is generated
			System.out.println("made it past trying..");
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + file);
		}
		// despite exception.. we can go on thanks to catching and handling the exception
		System.out.println("Still ran despite exception");
	}

}
