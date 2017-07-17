package droid1;


public class App {

	public static void main(String[] args) {

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		//String sentenceToTest = new String("The quick red fox jumps over the lazy brown dog");
		String sentenceToTest = new String("The fox jumps over the lazy brown dog"); // shorter to be missing some
		char[] missingLetters = new char[26]; // char array to put missing chars in
		
		int k = 0;

		for (int i = 0; i < alphabet.length; i++) {
			if (sentenceToTest.indexOf(alphabet[i]) != -1) {
				System.out.printf("there is %c in temp string\n", alphabet[i]);
			} else {
				System.out.printf("there is no %c in temp string\n", alphabet[i]);
				missingLetters[k] = alphabet[i];
				k++; // for tracking how many chars are in the missing array
			}
		}
		System.out.println(missingLetters);
	}
}