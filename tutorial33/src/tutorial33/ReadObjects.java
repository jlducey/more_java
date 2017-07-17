package tutorial33;

	import java.io.FileInputStream;
	import java.io.IOException;
    import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {

		System.out.println("Reading objects..");

		try {
			FileInputStream fs = new FileInputStream("people.bin");

			ObjectInputStream os = new ObjectInputStream(fs);

			Person person1 = (Person) os.readObject();
			Person person2 = (Person) os.readObject();

			os.close();

			System.out.println(person1);
			System.out.println(person2);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

