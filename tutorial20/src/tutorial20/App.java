package tutorial20;

public class App {

	public static void main(String[] args) {
		// inefficent way to do strings stuff.. 3 strings created
		String info = "";
		info += "My name is Bob, ";
		info += "I am a builder.";
		System.out.println(info);
		
		// efficient way only one string created
		StringBuilder sb = new StringBuilder("");
		sb.append("I am sue, ");
		
		// can skip name if you don't do a semicolon as it appends to same reference
		sb.append("how do you do")
		.append(" and so on");
		
		// use our string builder instance's toString method to output our string
		System.out.println(sb.toString());
		
		// other ways to use appending
		sb.append("one two three");
		
		//classic printf
		System.out.printf("testing one two %d", 12);
      
		// printf that formats a column of numbers
		for(int i=0;i<20;i++){
			System.out.printf("number is %2d :\n", i);
		}
		
		// printf of a string
		System.out.printf("This is my string %s\n", "hello world");
		
		// printf of a float
		System.out.printf("My float is %f\n", 5.6);		
		
	}

}
