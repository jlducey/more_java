package hashmap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        
        String got = map.get(4);
        
        System.out.println(got);
        
        // using a key that isn't in the hash will return "null"
        String got2 = map.get(9);
        System.out.println(got2);
        
        // can have duplicate values, but keys are unique.. if you use one over it overwrites value in same key
        
        // To go through the key/value pairs, java uses this monstrosity
        //   Note it is a colon not a semicolon in the "for"
        for( Map.Entry<Integer, String> entry : map.entrySet() ) {
        	int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +" : " + value);
        }
        // also a normal hashmap has a near random order.. it is NOT sorted
	}
}