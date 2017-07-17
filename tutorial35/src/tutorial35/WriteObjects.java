package tutorial35;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing arrays of objects..");

		Person[] people = { new Person(1, "june"), new Person(2, "may"), new Person(3, "april"), new Person(4, "dec") };

		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try {
			FileOutputStream fs = new FileOutputStream("people.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);
			os.writeObject(peopleList);
			os.writeInt(peopleList.size());
			for (Person person : peopleList) {
				os.writeObject(person);
			}

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
