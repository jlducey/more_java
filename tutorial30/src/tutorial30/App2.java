package tutorial30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
// cleaner implementation of reading a file only available in java 7 or later
	public static void main(String[] args) {
    File file = new File("test.txt");
    
    try (BufferedReader br = new BufferedReader(new FileReader(file))){
    	String line;
    	while ((line = br.readLine()) != null){
    		System.out.println(line);
    	}
    } catch (FileNotFoundException e) {
		System.out.println("File not found: " + file);
	} catch (IOException e) {
		System.out.println("Unable to read file: " + file);
	}
	}

}
