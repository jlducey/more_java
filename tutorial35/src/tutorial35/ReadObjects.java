package tutorial35;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {

		System.out.println("Reading serialized list of arrays..");

		try {
			FileInputStream fs = new FileInputStream("people.ser");

			ObjectInputStream os = new ObjectInputStream(fs);

			// cast people as array of Person type..
			Person[] people = (Person[])os.readObject();

			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>) os.readObject();

			int num = os.readInt();
			for (int i = 0; i < num; i++) {
				Person person = (Person) os.readObject();
				System.out.println(person);
			}
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
