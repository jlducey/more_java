package tutorial26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
// since reading file can error.. either throws here or try in scanner part
	public static void main(String[] args) throws FileNotFoundException {
		// can use single other direction slash as well on windows
		
		//String fileName = "C:\\Users\\zippy\\Desktop\\mytext.txt";
		
		// note where text is in explorer on left to be used without a path
		String fileName = "mytext.txt";
		
		File textFile = new File(fileName);

    	 Scanner in = new Scanner(textFile);
		
    	 while(in.hasNextLine()){
    		 // if you use in.nextInt must have in.NextLine() to move past cr/ln or be off by one
    		 String line = in.nextLine();
    		 System.out.println(line);
    	 }
    	 
    	 in.close(); // we opened file 'in', must close it
	}

}
