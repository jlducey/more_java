package tutorial24;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// generics .. specify type of vars in array
		ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("cow");
        strings.add("alligator");
        
        String animal = strings.get(1);// note array but not square brackets
        System.out.println(animal);
        System.out.println(strings.get(0));
	}
}
