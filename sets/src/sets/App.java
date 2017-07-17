package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		//HashSet does not retain order.. its unordered set
		//Set<String> myset = new HashSet<String>();
		
		// LinkedHashSet retains order entered in set
		//Set<String> myset = new LinkedHashSet<String>();
		
		// TreeSet  returns in natural order
		Set<String> myset = new TreeSet<String>();
		
		  if(myset.isEmpty()){
			  System.out.println("myset is empty");
		  }
		  
		  myset.add("mouse");
		  myset.add("rodent");
		  myset.add("bat");
		  myset.add("bear");
		  myset.add("snake");
		  
		  
		  // repeated entries only occur once in set
		  myset.add("bat");
		  
		  System.out.println(myset);

		  //Iterate through a set with
		  for(String element: myset){
			  System.out.println(element);
		  }
		  
		  //to find element in set
		  if (myset.contains("cow")){
			  System.out.println("has cow");
		  }
		  if (myset.contains("bat")){
			  System.out.println("has bat");
		  }
	}

}
