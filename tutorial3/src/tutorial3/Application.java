package tutorial3;

public class Application {
	public static void main(String[] args) {
		int value = 1;
		while (value < 20) {
			String myString1 = "hello";
			String myString2 = "there";
			System.out.println(myString1 + " " + value + myString2);
			value++;
		}
		for(int i=0;i <10;i++){
			System.out.printf("i is %d\n", i);
		}
	}
}