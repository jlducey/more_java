package tutorial62;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cow");
		animals.add("bat");
		
		
		Iterator<String> it =  animals.iterator();
		
		// old iterator way to print out vlues
		while(it.hasNext()) {
		String value = it.next();
		System.out.println(value);
	}
		
		// modern java 5+ way
        for(String animal: animals){
        	System.out.println(animal);
        }

	}

}
