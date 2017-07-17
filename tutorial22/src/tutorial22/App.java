package tutorial22;

public class App {

	public static void main(String[] args) {
		
	   int intValue = 888;
	   long longValue = 23355;
	   
	   float floatValue = 8824.8f; // note f at end
	   float floatValue2 = (float)8824.8; //no f needed
	   
	   double doubleValue = 32.4;
	   
	   System.out.println(Byte.MAX_VALUE);

	   intValue = (int)longValue; // cast long to int
	   System.out.println(intValue);
	   
	   doubleValue = intValue;
	   System.out.println(doubleValue);
	   
	   intValue = (int)floatValue;
	   System.out.println(intValue);
	   
	   byte byteValue = (byte) 125;
	   System.out.println(byteValue);
	}

}
