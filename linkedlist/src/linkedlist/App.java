package linkedlist;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		    doTimings("ArrayList", arrayList);
		    doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(i); // add new values at end of list
		}
		long end = System.currentTimeMillis();
		System.out.println(" Time Taken: " + (end - start) + " ms for " + type + " added at end of list");

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i); // add new values at start of list
		}
		long end2 = System.currentTimeMillis();
		System.out.println(" Time Taken: " + (end2 - start2) + " ms for " + type + " added at start of list");
	}
}
