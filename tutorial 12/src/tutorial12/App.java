package tutorial12;

// notice this class doesn't have () in it.. those go in class methods
class Robot{
	// these are private class variables so not visible from outside class.. need getAge method to access externally
	private int age;
	private String name;
	
	// class method Speak has String parameter passed in
	public void Speak(String text){
		System.out.println(text);
	}
	// class method Jump has 2 parameters passed in must be in same order
	public void Jump(String direction,int meters){
		System.out.println("Jump "+ direction + " " + meters);
	}
	
	// calls method variable age.. so have to use this.age to indicate class variable age
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
}

public  class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		// next line passes string as parameter to method
		sam.Speak("hello");
		// multiple parameters passed
		//sam.Jump("West", 7);
		sam.setAge(7);
		sam.setName("bobby");
		// to get name or age from class.. have to use get methods since the age/name are private in the class
		System.out.println(sam.getName());
		System.out.println(sam.getAge());
	}
}
