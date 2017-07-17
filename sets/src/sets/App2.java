package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
	
		Set<String> myset1 = new TreeSet<String>();
		  myset1.add("mouse");
		  myset1.add("rodent");
		  myset1.add("bat");
		  myset1.add("bear");
		
		  
		  Set<String> myset2 = new TreeSet<String>();
		  myset2.add("mouse");
		  myset2.add("rodent");
		  myset2.add("bat");
		  myset2.add("bear");
		  myset2.add("snake");
		  
	   //         INTERSECTION OF TWO SETS
	   // make intersection a copy of myset1, then do retainAll of myset2 to get intersection to only have what is in both sets
	   Set<String> intersection = new HashSet<String>(myset1);
	   intersection.retainAll(myset2);
	   
	   System.out.println("intersection of two sets is: " + intersection);
	   
	   //        DIFFERENCE OF TWO SETS.. order matters.. one way its snake other is null
	   Set<String> difference = new HashSet<String>(myset2);
        difference.removeAll(myset1);
	   
	   System.out.println("difference of two sets is: " + difference);
	   
	}

}
