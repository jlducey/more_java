package tutorial6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("please enter a word");
     String text = input.nextLine();
     
    switch(text) {
    case "start":
    	System.out.println("Engine started");
    	break;
    	
    case "stop":
    	System.out.println("Engine stopped");
    	break;
    
    default:
    	System.out.println("command not recognized");
    	break;
    }
    
	}
}
