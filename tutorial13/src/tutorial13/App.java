package tutorial13;

class Machine{
	// couple private class variables not accessible from outside of class
	private int code;
	private String name;
	
	// class constructor.. no return type, and name must match class name.. method runs each time you instantiate instance
	public Machine(){
		// can run other constructors to add defaults for instance by using this .. must be first statement though
		this("default",1);
		System.out.println("contructor running");
	}
	// can have multiple constructors.. differing by parameters passed, compiler will pick right one
	public Machine(String name){
		this.name = name;
		System.out.println("second constructor running");
	}
	public Machine(String name, int code){
		this.name = name;
		this.code = code;
		System.out.println("third constructor running");
	}
}


public class App {

	public static void main(String[] args) {
		// just making an instance of Machine, runs the class constructor
		Machine roby = new Machine();
		
		// don't have to name the object to instantiate it
		new Machine();
		new Machine("tyrone");
		new Machine("betty", 101);

	}

}
