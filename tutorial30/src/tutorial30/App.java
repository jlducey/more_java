package tutorial30;

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing now");
		throw new Exception("oh no");
	}
	
}
public class App {

	public static void main(String[] args) {
		
		try(Temp mytemp = new Temp()) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
