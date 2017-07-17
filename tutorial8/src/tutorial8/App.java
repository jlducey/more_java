package tutorial8;

public class App {

	public static void main(String[] args) {
		int a = 10; // initialize and set a single integer var
		
		int[] b = { 1, 4, 7, 9 }; // initialize and set an integer array
		
		int[][] c = { { 1, 2, 4, 12 }, { 8, 54 }, { 99, 11, 7, 6 }}; // init an int array of arrays

		System.out.println(a); // simple to just print a single var with a single value
		System.out.println(b[2]); // with a 1 dimensional array you have to say which one you want to print
		
		System.out.println(b); // If you just give name of one dimensional.. it prints reference instead of the values
		
		System.out.println(c[1][1]); // c has 3 arrays in it so you have to say which one, and which element in it
		
		// To iterate over the 2 dimensional array.. go through however many arrays there are, and for each one.. print each element
		for(int row = 0;row < c.length; row++){
			for (int col = 0; col< c[row].length; col++){
				//System.out.println(c[row][col]);
				System.out.print(c[row][col] + " ");
			}
		}
	}
}
