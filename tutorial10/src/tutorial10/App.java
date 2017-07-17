package tutorial10;

class Person {
	// class can have data
	String name;
	int age;

	// class can have subroutines, known as class methods
	void sayHello() {
		System.out.println("hello" + " my name is " + name);
	}
	
	// getter methods return a value so are typed instead of being void
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// create new instance (an object) of class person
		Person person1 = new Person();
		person1.age = 50;
		person1.name = "doris";
		
		//call getter class methods of object
		int oldness = person1.getAge();
		String nameness = person1.getName();
		
		System.out.println(oldness);
		System.out.println(nameness);
	}

}
