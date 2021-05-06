package collectionsFramework;

import java.util.ArrayList;
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
		
	}

}
