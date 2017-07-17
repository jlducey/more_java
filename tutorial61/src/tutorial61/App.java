package tutorial61;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		
		// (head) oooooooooooooooooooooooooooo <- (tail) FIFO  first in first out 
		
        // note que has fixed size of 3 elements
		Queue<Integer> ql = new ArrayBlockingQueue<Integer>(3);
        ql.add(10);
        ql.add(15);
        ql.add(30);
        try {
        	ql.add(40);
        } catch (IllegalStateException e) {
        	System.out.println("Tried to add to many elements to array");
        	
        }
        
        for(Integer value: ql){
        System.out.println("que value: " + value);
        }
        
        Integer value;
        System.out.println("removed an element: " + ql.remove());
        
        
      //  System.out.println("value is: " + value);
       
	}

}
