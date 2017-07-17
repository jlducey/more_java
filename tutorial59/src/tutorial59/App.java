package tutorial59;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

class StringLengthComparator implements Comparator<String> {
	// lets make a compare method for strings based on length of string
	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

class ReverseAlphabeticalStringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2); // compareTo gives alphabetical order, minus
									// sign reverses it
	}

}

public class App {

	public static void main(String[] args) {
		///////////////////////// Sorting Strings //////////////////////////////
		List<String> animal = new ArrayList<String>();

		animal.add("tiger");
		animal.add("lion");
		animal.add("snake");
		animal.add("mongoose");
		animal.add("cat");
		animal.add("elephant");

		// sort method of Collections will sort list of strings in alphabetical
		// order
		// Collections.sort(animal);

		// this sorts animals by name string length using my override method
		// Collections.sort(animal, new Comparator());

		Collections.sort(animal, new ReverseAlphabeticalStringComparator());

		System.out.println("Reverse aphabetical String sorted animal list: ");

		for (String critter : animal) {
			System.out.println(critter);
		}

		///////////////////////// Sorting Numbers //////////////////////////////
		List<Integer> list = new ArrayList<Integer>();

		list.add(3);
		list.add(36);
		list.add(73);
		list.add(40);
		list.add(1);

		// when given a list of integers, sort method of Collections sorts it
		// naturally.. numeric
		Collections.sort(list);

		System.out.println("\nNatural sorted number list: ");

		for (Integer number : list) {
			System.out.println(number);
		}

		// can implement own sort as anonymous class method overriding compare
		// .. example is for int reversed
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

		System.out.println("\nReverse sorted number list: ");

		for (Integer number : list) {
			System.out.println(number);
		}

		///////////////////////// Sorting Arbitrary Objects
		///////////////////////// //////////////////////
		List<Person> people = new ArrayList<Person>();

		people.add(new Person(1, "joe"));
		people.add(new Person(2, "sue"));
		people.add(new Person(3, "clare"));
		people.add(new Person(4, "bob"));

		Collections.sort(people, new Comparator<Person>() {
			// compare on higher id number
			public int compare(Person p1, Person p2) {
				if (p1.getId() < p2.getId()) {
					return 1;
				} else if (p1.getId() > p2.getId()) {
					return -1;
				}
				return 0;
			}

		});

		System.out.println("\nPeople sorted by id number list: ");

		for (Person person : people) {
			System.out.println(person);
		}

		Collections.sort(people, new Comparator<Person>() {
			// compare on name string
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		System.out.println("\nPeople sorted by name list: ");

		for (Person person : people) {
			System.out.println(person);
		}

	}
}