package tutorial58;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	// hashCode() and equal() methods were auto added from source by eclipse
	// necessary as set had duplicates without it
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	// had to add this to Person class as print didn't have a toString() method to print it out
	public String toString(){
		return id + " " + name;
	}
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person(0,"bob");
		Person p2 = new Person(1,"sue");
		Person p3 = new Person(2,"mike");
		Person p4 = new Person(1,"sue");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

		map.put(p1, 1);
		map.put(p2, 4);
		map.put(p3, 2);
		map.put(p4, 3);

		for (Person key : map.keySet()) {
			System.out.println("key: " + key + "  value:  " + map.get(key));
		}

		Set<Person> set = new LinkedHashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
        // our set of Persons.. gets printed with the toString() defined in Person class
		System.out.println(set);
	}

}