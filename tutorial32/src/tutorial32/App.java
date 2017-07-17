package tutorial32;

public class App {

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
// recursively calls self.. need limit or quick stack overflow and exceeds int size
	private static int factorial(int value) {
		if (value == 1) {
			return 1;
		}
		return factorial(value - 1) * value;
	}
}