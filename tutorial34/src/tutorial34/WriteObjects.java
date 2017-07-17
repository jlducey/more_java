package tutorial34;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing objects..");

		Person[] people = { new Person(1, "june"), new Person(2, "may"), new Person(3, "april"), new Person(4, "dec") };

		try {
			FileOutputStream fs = new FileOutputStream("people.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(people);

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
