package tutorial11;


// notice this class doesn't have () in it.. those go in class methods
class Robot{
	// class method Speak has String parameter passed in
	public void Speak(String text){
		System.out.println(text);
	}
	// class method Jump has 2 parameters passed in must be in same order
	public void Jump(String direction,int meters){
		System.out.println("Jump "+ direction + " " + meters);
	}
}


/**
 * @author pez
 *
 */
public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		// next line passes string as parameter to method
		sam.Speak("hello");
		// multiple parameters passed
		sam.Jump("West", 7);
	}
}
