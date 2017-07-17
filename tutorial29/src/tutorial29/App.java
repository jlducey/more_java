package tutorial29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("test.txt");
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			// readline only gets one line, so have to go till null
			while ((line = br.readLine()) != null) {
			System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found: " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
             try {
				br.close();
			} catch (IOException e) {
				System.out.println("File not closed, due to it not opening");
			} catch (NullPointerException ex){
				// no op
			}
	}

}
