package tutorial34;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {

		System.out.println("Reading serialized array of objects..");

		try {
			FileInputStream fs = new FileInputStream("people.ser");

			ObjectInputStream os = new ObjectInputStream(fs);

			Person[] people = (Person[]) os.readObject();

			for (Person person : people) {
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
