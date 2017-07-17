package tutorial63;

import java.util.LinkedList;
import java.util.Iterator;

public class UrLibrary implements Iterable<String> {
	
private LinkedList<String> urls = new LinkedList<String>();

public UrLibrary(){
	urls.add("http://www.caveofprogramming.com");
	urls.add("http://www.amazon.com");
	urls.add("http://www.ebay.com");
    }

@Override
public Iterator<String> iterator() {
	return urls.iterator();
    }
}
