package tutorial23;

class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera Started");
	}
	
	public void snap() {
		System.out.println("Photo Taken");
	}
}


public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// upcasting .. casted to class higher in hierarchy
		Machine machine2 = camera1;
        machine2.start();
        // machine2.snap();  type of var determines methods avail
        // type of obj determines which method is called though
        
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();
        
        // doesn't work --- runtime error
        Machine machine4 = new Machine();
        //Camera camera3 = (Camera)machine3;
        // Camera3.start();
        // Camera3.snap();
        
	}

}
