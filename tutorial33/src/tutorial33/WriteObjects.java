package tutorial33;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing objects..");

		Person joe = new Person(4, "joe");
		Person sue = new Person(2, "sue");

		try {
			FileOutputStream fs = new FileOutputStream("people.bin");
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(joe);
			os.writeObject(sue);

			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
