package tutorial9;


class Person {
	// class can have data
	String name;
	int age;

	// class can have subroutines, known as class methods
	void sayHello() {
		System.out.println("hello" + " my name is " + name);
	}
}

public class App {

	public static void main(String[] args) {
		
		// we make a bob instance of Person class
		Person bob = new Person();
		bob.name = "bob";
		bob.age = 75;

		// we make a joe instane of Person class
		Person joe = new Person();
		joe.name = "joe";
		joe.age = 70;

		System.out.println(joe.name);
		System.out.println(joe.age);
		System.out.println(bob.name);
		System.out.println(bob.age);

		// have the bob instance of Person use its sayHello method
		bob.sayHello();

	}

}
