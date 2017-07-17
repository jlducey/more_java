package passing;

public class App {

	public static void main(String[] args) {
		App app = new App();
		
		// calling show method passing an integer
		int fox = 7;
		app.show(fox);
		// calling show method passing a string
		app.show("hi mom");
		// calling show method passing a person object
		Person person = new Person(1, "joe");
		app.show(person);
	}
// we can define class member methods with different object types passed in
	
	public void show(int value) {
		System.out.println("value is: " + value);
	}

	public void show(String value) {
		System.out.println("value is: " + value);
	}

	public void show(Person value) {
		System.out.println("value is: " + value);
	}
}
