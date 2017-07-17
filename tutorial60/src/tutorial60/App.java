package tutorial60;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


    class Person{
    	private String name;
    	
    	public String getName() {
			return name;
		}

		public Person(String name){
    		this.name=name;
    	}
    		
		public String toString() {
    		return name;
    	}
		
    }

public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();
		addElements(list);
		addElements(set);

		//Collections.sort((List<T>) list);

		showElements(list);
		showElements(set);

	}

	private static void addElements(Collection<Person> col) {

		col.add(new Person("joe"));
		col.add(new Person("sue"));
		col.add(new Person("juliet"));
		col.add(new Person("clare"));
		col.add(new Person("mike"));

	}

	private static void showElements(Collection<Person> col) {
		for (Person element : col) {
			System.out.println(element);
		}

	}
}
