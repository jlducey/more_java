package tutorial25;

// anonymous class lesson

class Machine {
	// make a class with a start method that is overriden
	public void start(){
		System.out.println("Starting machine...");
	}
}
// this interface is implemented in the anonymous classes object
interface Plant {
	public void grow();
}

public class App {
	public static void main(String[] args) {
		// we instantiate an instance that is named Machine
		// but doesn't have method of Machine so its anonymous
	Machine machine1 = new Machine() {
		@Override public void start(){
			System.out.println("camera snapping..");
		}
	}; // this is odd place for semicolon..
	
	machine1.start();
	
	// instantiates an object with only an interface defined?
	Plant plant1 = new Plant(){
		@Override
		public void grow() {
			System.out.println("Plant growing");
		}
	}; // another odd place to note the semicolon
	
	plant1.grow();

	}

}
