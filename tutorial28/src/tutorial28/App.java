package tutorial28;





public class App {

	public static void main(String[] args) {
	
     Car car1 = new Car();
     car1.setId(3);
     
     Camera cam1 = new Camera();
     cam1.setId(4);
     
     // have to explicitly call the start methods.. 
     car1.start();
     cam1.start();
     
     // following won't work as Machine class is abstract type, so can't make objects directly with it
    // Machine mach1 = new Machine();
     
	}

}
