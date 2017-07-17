package objectsets;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;




public class App {

	public static void main(String[] args) {

		Person person1 = new Person(1, "joe");
		Person person2 = new Person(2, "jane");
		Person person3 = new Person(3, "chimp");

		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

		map.put(person1, 1);
		map.put(person2, 2);
		map.put(person3, 3);
		map.put(person1, 1);

		for (Person key : map.keySet()) {
			System.out.println(key + " :" + map.get(key));
		}

		Map<Person, Integer> map2 = new LinkedHashMap<Person, Integer>();

		map2.put(person1, 1);
		map2.put(person2, 2);
		map2.put(person3, 3);
		map2.put(person1, 1);

		for (Person key : map2.keySet()) {
			System.out.println(key + " :" + map2.get(key));
		}
	}
}
