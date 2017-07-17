package tutorial19;

class Thing{
	// can make count of instances by making static var with constructor that increments.. must give initial value
	public static int count = 0;
	
	public int id;
	
	// our constructor that increments the count
	Thing(){
		
		// This updates the classwide static count
		count++;
		id = count; // gives each instance id var a unique id based on moment of creation value of class count
	}
	
	// static and final is same as C++ constant
	public final static int MEANING_OF_LIFE = 42;
	
	// not static so every instance has a unique name string variable
	public String name;
	
	// static so only one master variable called description, same for all instances of Thing
	public static String description;
}


public class App {

	public static void main(String[] args) {
		
		System.out.println("before object count" + Thing.count);
		
		Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        
        // since description is static.. only one exists for class and is shared in all instances of class
        Thing.description = "shared class var";
        
        thing1.name = "bob";
        thing2.name = "sue";
        
        
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        
        // the static description is same for both instances
        System.out.println(thing1.description);
        System.out.println(thing2.description);
        
        // or you can directly access the class variable like when it was set
        System.out.println(Thing.description);
        
        // we can get static info from other classes as well, and info is not changeable
        System.out.println(Math.PI);
        
        // constants are declared as final static and convention is all caps.. like C++ constant
        System.out.println(Thing.MEANING_OF_LIFE);
        
        // print out count from incremented in contstructor class variable count
        System.out.println(Thing.count);
        System.out.println(thing1.id);
        System.out.println(thing2.id);
	}

}
