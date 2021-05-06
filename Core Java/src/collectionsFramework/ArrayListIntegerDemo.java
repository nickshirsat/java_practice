package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIntegerDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		//simple for loop
		System.out.println("\nSimple For");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//foreach
		System.out.println("\nForeach");
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Iterator
		System.out.println("\nIterator");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//CRUD
		
		//Create
		System.out.println("\nCreate");
		list.add(99);
		list.add(2, 22);
		System.out.println(list);
		
		//Update
		System.out.println("\nUpdate");
		try {			
			list.set(list.indexOf(22), 23);
		} catch (Exception e) {
			System.out.println("Element not found");
		}
		System.out.println(list);
		
		//Read
		System.out.println("\nRead");
		System.out.println(list.get(0));
		
		//Delete
		System.out.println("\nDelete");
		list.remove(0);
		System.out.println(list);
		
		//sort
		System.out.println("\nSort ASC");
		Collections.sort(list);
		System.out.println(list);
		
		//reverse
		System.out.println("\nReverse");
		Collections.reverse(list);
		System.out.println(list);
	}

}
